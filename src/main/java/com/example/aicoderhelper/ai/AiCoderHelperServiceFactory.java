package com.example.aicoderhelper.ai;


import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiCoderHelperServiceFactory {
    @Resource
    private ChatModel qwenChatModel;

    @Resource
    private ContentRetriever contentRetriever;

    @Resource
    private StreamingChatModel qwenStreamingChatModel;

    @Bean
    public AiCoderHelperService aiCoderHelperService() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        AiCoderHelperService aiCoderHelperService = AiServices.builder(AiCoderHelperService.class)
                .chatModel(qwenChatModel)
                .streamingChatModel(qwenStreamingChatModel)
                .chatMemory(chatMemory)
                .chatMemoryProvider(memoryId ->
                        MessageWindowChatMemory.withMaxMessages(10)) // 每个会话独立存储
                .contentRetriever(contentRetriever)
//                .tools(new InterviewQuestionTool()) // 工具调用
                .build();

        return aiCoderHelperService;
    }

}
