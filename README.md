# Sistema de controle de notas

## Teste

### Objetivo

O objetivo inicial deste teste é ter uma maior noção do problema, isto é, uma pequena tentativa de codificar os requisitos do sistema a ser implementado.

#### Objetivos especificos

> 1: O primeiro teste é para confirmar que a turma foi criada e esta possui a quantidade de alunos informada pelo professor.

> 2: Confirmar que as notas inseridas pelo professor respeitam as condições estabelecidas pelo método utilizado para avaliação dos alunos.

> 3: Ratificar se a média que o sistema calcula é igual a média esperada pelo professor com base no cálculo de média.

> 4: Caso a média seja menor que sete(7) deve possibilitar inserir uma quarta nota e os testes consistem em validar se esta quarta nota foi inserida e se em caso de ela não ser a menor nota, validar se a nova media é diferente da antiga.

### Casos de teste

1. deveCriarTurma()
2. deveInserirNotas()
3. deveCalcularMedia()
4. deveInserirUmaQuartaNotaECalcularNovaMedia()

## Métricas

Apesar das métricas para desenvolvimento de software não serem absolutas, pode-se avaliar a qualidade de maneira sistemática com base nos dados coletados. As métricas permitem ao engenheiro uma melhor identificação e correção de problemas.

> Os requisitos do software são a fundação a partir da qual o software poderá ser medido.

Os fatores para medição são avaliados em 2 grupos (Fatores de Qualidade de
McCall):

- Medidos diretamente
- Medidos indiretamente

Deve-se comparar o software (requisitos, projeto, código, dados) a algum valor (indicadores) para chegar a um resultado.

### Diretamente

#### Tamanho e complexidade

As métricas que descrevem o tamanho e a complexidade são
provavelmente algumas das métricas mais utilizadas para o código.

As métricas são colocadas de cima para baixo, de uma medida para a
unidade de nível mais alto (ou seja, Número de Pacotes (NOP)) até
uma medida de complexidade contando o número de caminhos
independentes em uma operação (ou seja, o complexidade
ciclomática)

São elas:

- NOP - Número de pacotes
- NOC - Número de classes
- NOM - Número de Métodos
- LOC - Linhas de códigos
  > CYCLO - Número Ciclomático ou Complexidade Ciclomática de McCabe
  > número total de caminhos de programa possíveis somados
  > de todas as operações no sistema.
  >
  > Usa-se essa métrica para quantificar a complexidade funcional
  > intrínseca do sistema.

### Fonte:

Slide de metricas do prof. dr. Samyr Beliche

## Aplicação de métricas

ferramente
