# Busca Binária
    > Observação: A busca binária só funciona em uma lista previamente ordenada.
<p>
    A busca binária é uma das formas mais eficientes de realizar uma busca. 
    Em comparação com a pesquisa simples, o algortimo de busca binária irá eliminar metade das opções durante a busca. 
    Se o elemento que você busca está na lista, o algortimo retornará sua posição.
</p>

```
    Princípio de Funcionamento:

    1.Ordenação:
        A lista deve estar ordenada em ordem crescente ou decrescente.

    2.Divisão:
        - Inicialmente, considere o elemento no meio da lista.
        - Compare o elemento buscado com o elemento no meio. Para encontrar o índice do meio é feito dividindo o número total de elementos por 2,
        e se necessário, arredondando para baixo.
        - Se forem iguais, a busca é concluída.
        - Se o elemento buscado for menor, repita a busca na metade inferior da lista.
        - Se o elemento buscado for maior, repita a busca na metade superior da lista.

    3.Iteração:
        - Repita o processo de divisão até encontrar o elemento desejado ou até que a lista seja reduzida a zero.
```
   

    Eu, particularmente, gosto de estudar com os conceitos de apontadores. 
    Basicamente, nesse algoritmo vamos trabalhar com o apontador inicio, meio e fim.

    Vamos imaginar o seguinte array com 11 elementos, vamos buscar o número 7: 
    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]   
     |              |               |
    inicio        meio             fim  

    - O elemento do meio(5) será comparado com o elemento que estamos buscando(7).   
    Como não é o elemento que queremos, comparamos se o meio é maior ou menor que o numero que queremos.   
    Como **5 < 7**, atualizamos os apontadores, o novo inicio da lista será a posição do **meio + 1** (já que o elemento do meio ja foi comparado),   


    
    [0, 1 , 2, 3, 4, 5, 6, 7, 8, 9, 10]     
                        |     |      |     
                    ini.   meio    fim    

    - O elemento do meio(8) não é o elemento que estamos buscando(7), portanto, vamos novamente comparar se é maior ou menor. 
    **Como 8 > 7**, o apontador do início será mantido, o do final será atualizado para meio - 1 e o novo meio será calculado. 
    Nesse exemplo, após essa iteração, achamos o elemento que queremos.  


     [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]    
                        |  |    
                        i. f.    
    Assim, encontramos o elemento 7 na posição 6 do array.  


![Busca Binária](01%20-%20Binary%20Search/binary-search-sequence-search.gif)

