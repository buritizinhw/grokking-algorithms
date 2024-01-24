# Busca Binária
    > Observação: A busca binária só funciona em uma lista previamente ordenada.

    A busca binária é uma das formas mais eficientes de realizar uma busca. Em comparação com a pesquisa simples, o algortimo de busca binária irá eliminar metade das opções durante a busca. Se o elemento que você busca está na lista, o algortimo retornará sua posição.

    Princípio de Funcionamento:

    1.Ordenação:
        A lista deve estar ordenada em ordem crescente ou decrescente.

    2.Divisão:
        - Inicialmente, considere o elemento no meio da lista.
        - Compare o elemento buscado com o elemento no meio.
        - Se forem iguais, a busca é concluída.
        - Se o elemento buscado for menor, repita a busca na metade inferior da lista.
        - Se o elemento buscado for maior, repita a busca na metade superior da lista.

    3.Iteração:
        - Repita o processo de divisão até encontrar o elemento desejado ou até que a lista seja reduzida a zero.

    -----------------------------------------------------------------------------------------------------------
    Eu, particularmente, gosto de estudar com os conceitos de apontadores. Basicamente, nesse algoritmo vamos trabalhar com o apontador inicio, meio((inicio+fim)//2) e fim.

    Vamos imaginar o seguinte array com 10 elementos, vamos buscar o número 7: 
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
     |           |               |
    inicio     meio             fim

    - O elemento do meio(5) será comparado com o elemento que estamos buscando(7). Como não é o elemento que queremos, comparamos se o meio é maior ou menor que o numero que queremos. Como **5 < 7**, atualizamos os apontadores, o novo inicio da lista será a posição do **meio + 1** (já que o elemento do meio ja foi comparado), o apontador do final pernacerá o mesmo e o meio irá para o novo meio(inicio+fim)//2.
<strike> 
    [1, 2, 3, 4, 5,</strike> 6, 7, 8, 9, 10] 
                    |     |      |   
                    ini. meio    fim  