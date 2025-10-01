# 📋 CRUD de Clientes

Este projeto foi desenvolvido com o objetivo de praticar a construção de uma **API REST** completa utilizando **Spring Boot**, aplicando conceitos de **camadas**, **CRUD**, **exceções** e **validações**.  

O sistema permite gerenciar clientes, oferecendo as seguintes operações:  
- 🔎 **Busca paginada de clientes**  
- 🔍 **Busca de cliente por ID**  
- ➕ **Inserção de novo cliente**  
- ✏️ **Atualização de cliente existente**  
- ❌ **Deleção de cliente**  

Cada cliente possui os seguintes atributos:  
- **Nome**  
- **CPF**  
- **Renda**  
- **Data de nascimento**  
- **Quantidade de filhos**  

Além disso, foram implementadas **regras de validação** e tratamento de exceções:  
- **Nome** não pode ser vazio  
- **Data de nascimento** não pode ser futura  
- Retorno **404** para cliente não encontrado  
- Retorno **422** para erros de validação com mensagens personalizadas  

## 🚀 Tecnologias utilizadas
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de dados H2**
- **Maven**

---
