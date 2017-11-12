# Encapsulamento

## Ferramenta

> Encapsulamento - deixar somente os m�todos importantes expostos
> Encapsulamento - atributos de instancia privados
> Encapsulamento - pode dizer o que o m�todo faz sem dizer como ele faz
> Encapsulamento - mudan�as devem ocorrer somente em um s� lugar
> Heran�a - Somente colocar na classe o que diz respeito a ela
> Heran�a - N�o possuir repeti��o de c�digo
> Heran�a- A classe filha deve usar todas as propriedades da classe pai
> Heran�a - Atributos protegidos para que a classe filha possa manipular atributos da classe pai.
> Polimorfismo - A classe de base possui o forma como o processo funciona
> Polimorfismo - A classe filha implementa as regras do funcionamento definido nos processos da classe base
> Polimorfismo - Os m�todos da classe pai devem ser constru�dos na classe filha
> Encapsulamento - cobertura de c�digo superior a 80%

## Inspe��o

##### Caso 1 - Encapsulamento - deixar somente os m�todos importantes expostos (1 - n�o usa, 2 - usa)
* Agenda: 2
* Horario: 2
* Partida: 2
* Temporada: 2
* Time: 2

##### Caso 2 - Encapsulamento - atributos de instancia privados (1 - n�o usa, 2 - usa)
* Agenda: 2
* Horario: 2
* Partida: 2
* Temporada: 2
* Time: 2

##### Caso 3 - Encapsulamento - pode dizer o que o m�todo faz sem dizer como ele faz  (1 - n�o se aplica, 2 - razoavelmente, 3 - completamente)
* Agenda: 2
* Horario: 2
* Partida: 2
* Temporada: 2
* Time: 2

##### Caso 4 - Encapsulamento - mudan�as devem ocorrer somente em um s� lugar. (1 - n�o ocorre, 2 - ocorre)
* Agenda: 2
* Horario: 2
* Partida: 2
* Temporada: 2
* Time: 2

##### Caso 5 - Heran�a - Somente colocar na classe o que diz respeito a ela (1 - n�o ocorre, 2 - ocorre)
* Agenda: 2
* Horario: 2
* Partida: 2
* Temporada: 2
* Time: 2

##### Caso 6 - Heran�a - N�o possuir repeti��o de c�digo (1 - possui repeti��o,  2 - possui pouca, 3 - n�o possui repeti��o)
* Agenda: 3
* Horario: 3
* Partida: 3
* Temporada: 2
* Time: 3

##### Caso 7 - Heran�a - A classe filha deve usar todas as propriedades da classe pai (1 - n�o usa, 2 - usa)
> Basquete: 2 (nao possui pai)
> Jogo: 2 (nao possui pai)
> TimeBasquete: 2
> ControleJogos:  (nao possui pai)

##### Caso 8 - Heran�a - Atributos protegidos para que a classe filha possa manipular atributos da classe pai.
> N�o houve necessidade de manipula��o de propriedades alem das informadas nas classes pai.

##### Caso 9 - Polimorfismo - A classe de base possui o forma como o processo funciona. (1 - N�o, 2 - Sim)
> InterfacePontuacao - 2

##### Caso 10 - Polimorfismo - A classe filha implementa as regras do funcionamento definido nos processos da classe base.  (1 - N�o, 2 - Sim)
> InterfacePontuacao (Cesta01, Cesta02, Cesta03) - 2 

##### Caso 11 - Polimorfismo - Os m�todos da classe pai devem ser constru�dos na classe filha (1 - N�o, 2 - Sim)
> InterfacePontuacao (Cesta01, Cesta02, Cesta03) - 2 

##### Caso 12 - Encapsulamento - cobertura de c�digo superior a 80% (1 - abaixo, 2 - 80%, 3 - 100%)
> ControleJogosTest - 3