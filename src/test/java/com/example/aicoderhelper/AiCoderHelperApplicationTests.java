package com.example.aicoderhelper;

import com.example.aicoderhelper.ai.AiCoderHelper;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCoderHelperApplicationTests {

    @Resource
    private AiCoderHelper helper;


    @Test
    void chat() {
        helper.chat("你好，你是谁？");
    }

    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://qnam.smzdm.com/202210/25/6357713e36a178861.jpg_e1080.jpg")
        );

        helper.chatWithMessage(userMessage);

    }


}
