package com.example.aicoderhelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AiCoderHelperServiceTest {
    @Resource
    private AiCoderHelperService aiCoderHelperService;


    @Test
    void chat() {
        String chat = aiCoderHelperService.chat("你好，你是谁？如何在java中输入hello world？");
        System.out.println(chat);
    }

    @Test
    void chatWithMemory(){
        String chat = aiCoderHelperService.chat("你好，我是马文煜，你是谁？");
        System.out.println(chat);
        chat = aiCoderHelperService.chat("你好，我叫什么名字？");
        System.out.println(chat);
    }

    @Test
    void chatForReport() {
        String message = "你好，我是马文煜，男，学习编程3年了，能帮我吗？";
        AiCoderHelperService.Report report = aiCoderHelperService.chatForReport(message);
        System.out.println(report);

    }

    @Test
    void chatWithRag() {
        String message = "你好，我是马文煜，男，我想知道我的309机房里面的4090服务器密码是多少？";
        String chat = aiCoderHelperService.chat(message);
        System.out.println(chat);

    }
}