# Testes de um sistema de controle de notas

## Objetivo

O objetivo inicial deste teste é ter uma maior noção do problema, isto é, uma pequena tentativa de codificar os requisitos do sistema a ser implementado.

### Objetivos especificos

> 1: O primeiro teste é para confirmar que a turma foi criada e esta possui a quantidade de alunos informada pelo professor.

> 2: Confirmar que as notas inseridas pelo professor respeitam as condições estabelecidas pelo método utilizado para avaliação dos alunos.

> 3: Ratificar se a média que o sistema calcula é igual a média esperada pelo professor com base no cálculo de média.

> 4: Caso a média seja menor que sete(7) deve possibilitar inserir uma quarta nota e os testes consistem em validar se esta quarta nota foi inserida e se em caso de ela não ser a menor nota, validar se a nova media é diferente da antiga.

## Casos de teste

1. deveCriarTurma()
2. deveInserirNotas()
3. deveCalcularMedia()
4. deveInserirUmaQuartaNotaECalcularNovaMedia()
