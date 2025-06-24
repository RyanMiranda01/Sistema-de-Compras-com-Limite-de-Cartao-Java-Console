# 💳 Sistema de Compras com Limite de Cartão

Este é um projeto simples feito em Java que simula um sistema de controle de compras com base no limite disponível no cartão de crédito. O usuário pode adicionar produtos, ver o carrinho e visualizar o saldo restante, com ordenação dos itens por valor.

✨ Funcionalidades

✅ Entrada interativa via terminal (Scanner)

✅ Adição de produtos com nome e valor

✅ Verificação do limite antes de cada compra

✅ Ordenação automática dos produtos por valor (menor para maior)

✅ Visualização do carrinho e do saldo atual

✅ Encerramento automático se não houver saldo suficiente

📁 Estrutura do Projeto
Copiar
Editar

├── Produtos.java

├── FuncionamentoDoSistema.java

└── Principal.java

📚 Aprendizados
Este projeto foi desenvolvido como prática de:

Programação orientada a objetos (POO)

Estruturas de dados em Java (List)

Lógica condicional e laços de repetição

Organização e clareza no código

📦 Tecnologias utilizadas
Java 17+

ArrayList

Collections.sort

Scanner

Comparable para ordenação

Boas práticas com extração de métodos e encapsulamento
## 🚀 Demonstração (Terminal)
```bash
Digite o limite do cartão: 
100

Digite a descrição do produto: 
Camisa
Digite o valor da compra: 
35.5
Compra realizada!!

0 - Caso queira sair
1 - Caso queira continuar comprando 
2 - Caso queira ver o carrinho de compras 
