# Selection Sort
    > Observação: A busca binária só funciona em uma lista previamente ordenada.
<p>
    O Selection Sort é um algoritmo de ordenação simples e intuitivo que consiste em dividir a lista de elementos em duas partes: uma parte ordenada e uma parte não ordenada. Ele percorre repetidamente a parte não ordenada, encontra o menor (ou maior, dependendo da ordem desejada) elemento e o move para o final da parte ordenada.
</p>

```
Princípio de Funcionamento:

    1. Seleção:
        - O algoritmo seleciona o menor elemento da parte não ordenada e o troca com o primeiro elemento da parte não ordenada.

    2. Avanço da Fronteira:
        - Após cada iteração, a fronteira entre a parte ordenada e a parte não ordenada é avançada, colocando o menor elemento na posição correta.

    3. Repetição:
        - Esse processo é repetido até que a parte não ordenada seja vazia, ou seja, até que todos os elementos estejam na parte ordenada.

```
   
<p>
    O Selection Sort não é eficiente para listas muito grandes devido ao seu desempenho quadrático em termos de tempo de execução. No entanto, é fácil de implementar e pode ser útil para pequenas listas ou como parte de algoritmos mais complexos.
</p>

Vamos imaginar o seguinte array com 5 elementos que queremos ordenar do menor para o maior. [7, 4, 2, 8, 1]
    
- Inicialmente, assumimos que o primeiro elemento da parte não ordenada é o menor.
- Percorremos todos os elementos na parte não ordenada e comparamos cada elemento com o menor atual.
- Encontramos que o menor elemento é 1.
- Trocamos o elemento 1 com o primeiro elemento da lista.

```css
    [7, 4, 2, 8, 1]   -->   [1, 4, 2, 8, 7]
     ^                          ^
    Menor elemento             Primeiro elemento da parte não ordenada
```
- A parte ordenada da lista é [1], e a parte não ordenada é [4, 2, 8, 7].
- Percorremos a parte não ordenada e encontramos que o menor elemento é 2.
- Trocamos o elemento 2 com o segundo elemento da lista.

```css
    [1, 4, 2, 8, 7]   -->   [1, 2, 4, 8, 7]
           ^                    ^
    Menor elemento       Segundo elemento da parte não ordenada
```
- Após o segundo passo, a lista se torna [1, 2, 4, 8, 7]. Agora, prosseguimos com os próximos passos do algoritmo até que a lista esteja completamente ordenada.


- A parte ordenada da lista é [1, 2], e a parte não ordenada é [4, 8, 7].
- O menor elemento na parte não ordenada é 4.
- Trocamos o elemento 4 com o terceiro elemento da lista.
```css
    [1, 2, 4, 8, 7]   -->   [1, 2, 4, 8, 7]
           ^                       ^
   Menor elemento       Terceiro elemento da parte não ordenada
```
- A parte ordenada da lista é [1, 2, 4], e a parte não ordenada é [8, 7].
- O menor elemento na parte não ordenada é 7.
- Trocamos o elemento 7 com o quarto elemento da lista.
```css
    [1, 2, 4, 8, 7]   -->   [1, 2, 4, 7, 8]
                 ^                    ^
     Menor elemento       Quarto elemento da parte não ordenada
```
- Após esse passo, a lista finalmente se torna [1, 2, 4, 7, 8], que está completamente ordenada.

<p align="center">
  <img src="SelectionSort.gif" alt="Selection Sort">
</p>


