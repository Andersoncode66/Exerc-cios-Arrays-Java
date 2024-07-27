# 30 Exercícios com Arrays em Java
Bem-vindo ao repositório em exercícios práticos com arrays em Java! Este guia destina-se a estudantes e desenvolvedores que desejam aprimorar suas habilidades na manipulação de arrays. Cada exercício abrange conceitos fundamentais e operações comuns em arrays.



## Índice
1. Criação de um Array e Impressão
2. Soma de Elementos
3. Encontrar o Maior Elemento
4. Inverter um Array
5. Ordenar um Array
6. Média dos Elementos
7. Contar Elementos Pares
8. Mesclar Dois Arrays
9. Remover Duplicados
10. Ratacionar um Array



## Exercício 1: Criação de um Array e Impressão
- Descrição: Crie um array de inteiros com 10 elementos e imprima todos os elementos do array
- Neste exercício, você aprenderá a criar um array de inteiros em Java e a imprimir todos os elementos desse array. Arrays são estruturas de dados que permitem armazenar múltiplos valores de um mesmo tipo em uma única variável, facilitando a manipulação de conjuntos de dados.

  ## Respostas
![Exercicio01](https://github.com/user-attachments/assets/02bf8be8-7230-446c-8d3d-7c8e0f18f79f)


![Exercicio01new](https://github.com/user-attachments/assets/26f365a8-6a7f-49be-a34b-d961f04b28bd)


![Exercicio01listadevalores](https://github.com/user-attachments/assets/c5f05523-ad41-491e-a399-b9250b401bb7)



## Explicação do Código
1. Declaração e Inicialização do Array:

![cap](https://github.com/user-attachments/assets/54ec53b9-df73-435e-ac2e-adebd23b55b0)

Aqui, estamos declarando e inicializando um array de inteiros chamado 'numeros' com 10 elementos. Os elementos são os números de 1 a 10.

2. Impressão dos Elementos do Array:

![Impressão](https://github.com/user-attachments/assets/d21b717e-b6e2-4fbe-b3bb-caece334fb10)

Usamos um laço 'for-each' para iterar sobre cada elemento do array e imprimir seus valores. O operador '+' no 'System.out.print(numero + "'); ' adiciona um espaço após cada número para melhorar a legibilidade na saída.






## Exercício 2: Soma de Elementos
- Descrição: Crie um array de inteiros com 5 elementos e calcule a soma de todos os elementos do array.
- Neste exercício, você aprenderá a criar um array de inteiros em Java e a calcular a soma de todos os elementos desse array. A operação de soma é uma das mais básicas e comuns ao lidar com arrays, e é essencial para diversas aplicações como cálculo de médias, totais e outras estatísticas.

- ## Respostas
![resposta01](https://github.com/user-attachments/assets/375b1dbb-132d-4286-bdad-3635a27cbf84)

![resposta2](https://github.com/user-attachments/assets/ee350a58-d568-4bbd-9837-cdf56e8933cc)

![02](https://github.com/user-attachments/assets/55e25639-8a75-4c54-a538-d4d567651f2f)





## Exercício 3: Encontrar o Maior elemento
- Descrição: Crie um array de inteiros e encontre o maior elemento presente no array.
- Neste exercício, você aprenderá a criar um array de inteiros em Java e a encontrar o maior elemento presente nesse array. Identificar o maior elemento de um array é uma operação comum em muitas aplicações, como encontrar o valor máximo em um conjunto de dados.


### Explicação do 'for-each':
![analisar](https://github.com/user-attachments/assets/5b1d7576-63fe-4a75-80a3-b9a8fc489fd5)

### Explicação:
1. Inicialização da variável 'maior':

![analisar](https://github.com/user-attachments/assets/a3b04d62-b62f-4a87-a71c-9716fff605e2)
- A variável 'maior' é inicializada com o primeiro elemento do array 'numeros'. Isso significa que, no início, assumimos que o maior número no array é o primeiro elemento (que, no caso deste array específico, é '1').


- ## Repostas
![03](https://github.com/user-attachments/assets/ffa28d66-4689-476d-83b3-47a24d4c4fa1)

![03](https://github.com/user-attachments/assets/f4448ca2-6cae-4cfa-a44c-eabf17f91226)

![03](https://github.com/user-attachments/assets/4aa453ba-075f-4b8f-af73-b35d5588f541)



## Exercício 4: Inverter um Array
- Descrição: Crie um array de inteiros e inverta os elementos desse array.
- Neste exercício, você aprenderá a criar um array de inteiros em Java e a inverter os elementos desse array. Inverter um array é uma operação comum que pode ser útil em várias situações, como reverter a ordem de uma lista de itens ou preparar dados para determinadas operações.

- ## Respostas
![04](https://github.com/user-attachments/assets/c0e0a255-ec51-4be2-b7ca-0a2ce7ff2c17)

![04](https://github.com/user-attachments/assets/b791845d-5efa-4601-ba2f-5458560863e4)


## Exercício 5: Ordenar um Array
- Descrição: Crie um array de inteiros e ordene os elementos em ordem crescente.
- Neste exercício, você aprenderá a criar um array de inteiros em Java e a ordenar os elementos desse array em ordem crescente. A ordenação de arrays é uma operação comum e útil em muitas aplicações, como classificação de dados e preparação de listas para busca binária.

### Explicação do 'Arrays.sort'
A biblioteca usada na linha 'Arrays.sort(numeros);' é a classe 'Arrays' do pacote 'java.util', Essa classe fornece vários métodos utilitários estáticos para manipulação de arrays, como ordenação, busca, comparação e preenchimento

Aqui está um resumo do que a linha 'Arrays.sort(numeros);'faz;
- 'Arrays.sort(numeros); ':Este método orderna o array 'numeros' em ordem crescente. Ele usa um algoritmo de ordenação eficiente, que pode virar dependendo da implementação, mas geralmente é uma versão modificada do quicksort ou mergesort.
- Para usar a classe 'Arrays', você precisa importar o pacote 'java.util' no início do seu código Java. Aqui está um exemplo completo:
- Importando a classe 'Arrays'
- A importação é feita com a seguinte linha:

![ex](https://github.com/user-attachments/assets/c0bd43df-4778-4cb9-a023-8976c4a080c7)
- Essa importação permite que você utilize os métods estáticos da classe 'Arrays', como 'sort()','binarySearch()','equals()','fill()', entre outros.



- ## Respostas
![05](https://github.com/user-attachments/assets/c627e534-50f5-4c0e-b127-6ce69c20a338)


![05](https://github.com/user-attachments/assets/9d784764-70f8-4bda-8c45-8074fbef6574)

