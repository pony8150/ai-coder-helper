# Qwen-LocalChat

**项目简介**
“Qwen-LocalChat”是一款基于 LangChain4j 构建的智能问答系统，集成阿里 Qwen 大模型，支持知识库问答与多轮对话。本项目旨在提供高效、精准的私有知识检索与智能问答服务。本人主要负责模型调用层与知识检索模块的设计与优化。


## 技术栈

* **后端**：Spring Boot
* **前端**：Vue
* **大模型**：Qwen-LLM
* **多轮对话与知识管理**：LangChain4j
* **向量检索**：FAISS
* **数据库**：MySQL
* **模型上下文管理**：MCP (Model Context Protocol)



## 核心功能与职责

1. **大模型封装与调用**

   * 基于 LangChain4j 封装 Qwen 模型接口，实现问答和多轮对话能力。

2. **知识检索与增强生成（RAG）**

   * 采用 RAG 架构结合 FAISS 向量检索，实现私有文档的语义召回和上下文增强，提高回答准确性。

3. **全网搜索与信息聚合**

   * 集成 MCP，实现全网信息检索与聚合能力，增强回答的实时性和可靠性。

4. **前后端系统架构**

   * 构建 Spring Boot + Vue 架构，支持实时对话、知识文档管理及交互式问答界面。


## 功能展示
<img width="1070" height="383" alt="image" src="https://github.com/user-attachments/assets/700bbc90-2dff-415c-a70c-695bc9b8db22" />

<img width="1061" height="2398" alt="image" src="https://github.com/user-attachments/assets/d93ce6da-e734-4635-93d4-9b0fb8cfca86" />

<img width="1065" height="820" alt="image" src="https://github.com/user-attachments/assets/fb1ac6da-16d0-45ee-8a95-7e8cf41ff8e7" />
RAG 功能示意图，展示知识检索增强生成的流程

## 快速开始

1. **克隆项目**

```bash
git clone https://github.com/pony8150/ai-coder-helper.git
cd ai-coder-helper
```

2. **启动后端**

* 使用 IntelliJ IDEA 打开项目
* 运行 `AiCoderHelperApplication` 类启动 Spring Boot 后端服务

3. **启动前端**

```bash
cd ai-coder-helper-frontier
npm install
npm run dev
```

4. **配置 Qwen 大模型 Key**

* 前往 Qwen 官方申请 API Key
* 在项目配置文件（`application-local.yml` ）中加入：

```yaml
langchain4j:
  community:
    dashscope:
      chat-model:
        model-name: qwen-plus
        api-key: <你的Qwen API Key>
```

5. **访问系统**

* 打开浏览器，访问前端地址：

```
http://localhost:3000
```
