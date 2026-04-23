Visão Geral 
PT-BR: O Sistema Cidade é um projeto acadêmico que tem como objetivo modelar uma cidade utilizando conceitos de Engenharia de Software, com foco em modularidade, reusabilidade e organização de sistemas .

O projeto utiliza uma analogia com peças de LEGO, onde cada elemento da cidade (como casas, estradas, hospitais e pontes) representa componentes reutilizáveis ​​e bem estruturados dentro de um sistema.

Objetivo do Projeto | Objetivo do Projeto
PT-BR:

Aplicar conceitos de Engenharia de Software na prática
Desenvolver modelagem completa utilizando UML
Demonstrar modularização e reutilização de componentes
Simular um sistema real de organização urbana.

Conceito Principal (Analogia LEGO)
PT-BR: O sistema foi projetado como um conjunto de peças de LEGO:

Cada classe é uma peça
Cada módulo é um conjunto de peças
Os diagramas mostram como essas peças se conectam
Isso facilita:

Reutilização
Organização
Escalabilidade

tapas de Desenvolvimento do Projeto
1. Diagrama de Pacotes (Estrutura Lógica)
Esta etapa organizou o sistema em pacotes lógicos, separando as responsabilidades e garantindo o baixo acoplamento entre os módulos da cidade.

Módulos definidos:

Infraestrutura: Gerencia as vias de acesso (Estradas e Pontes).

Edificações: Contém as estruturas físicas (Hospital, Escola e Casa).

Pessoas: Módulo responsável pela gestão dos cidadãos (Alunos, Professores, Médicos e Moradores).

Objetivo: Esta divisão permite uma organização superior, facilitando a manutenção e a reutilização de componentes em diferentes partes do sistema.

2. Diagrama de Classes (Detalhamento das Peças)
Definição rigorosa de classes, atributos, métodos e relacionamentos seguindo os padrões da UML.

Principais conceitos aplicados:

Herança (Generalização): As classes Aluno, Professor, Médico e Morador herdam características comuns da classe base Pessoa.

Agregação: As edificações (Casa, Escola, Hospital) possuem listas de pessoas, simulando a ocupação e a dinâmica dos espaços urbanos.

Interface: Uso da ViaDeAcesso para permitir que o tráfego seja liberado de forma polimórfica, independente do tipo de via.

Associação e Dependência: Conexão lógica entre as edificações e a infraestrutura viária disponível.

Objetivo: Converter os elementos físicos da cidade em uma arquitetura robusta orientada a objetos (POO).

3. Diagrama de Componentes (Arquitetura)
Modelagem física dos módulos do sistema e como eles se comunicam através de contratos bem definidos.

Componentes:

Componente Infraestrutura: Fornece serviços de acesso e tráfego.

Componente Edificações: Consome os serviços viários e gerencia a lógica urbana.

Componente Pessoas: Fornece as entidades e comportamentos dos cidadãos que interagem com os outros módulos.

Interfaces: Utilizadas para representar serviços providos (Provided Interfaces) e serviços exigidos (Required Interfaces), garantindo a modularidade do projeto.

4. Diagrama de Sequência (Dinâmica do Sistema)
Representa a interação entre os objetos ao longo do tempo em cenários de uso real.

Cenário modelado: Fluxo de emergência onde uma Casa solicita socorro, o Hospital aciona a equipe de Médicos e a Ambulância utiliza a interface de Via de Acesso para validar o trajeto mais eficiente (Estrada ou Ponte) até o destino final.

Ferramentas Utilizadas
Astah UML → Modelagem técnica de todos os diagramas.

Java → Linguagem utilizada para a base conceitual e lógica de POO.

IntelliJ IDEA → IDE de desenvolvimento e refatoração de código.

Git e GitHub → Controle de versionamento e documentação do projeto.

oas Práticas Aplicadas
Princípio da Responsabilidade Única (SRP)
Modularização do sistema
Separação de responsabilidades
Reutilização de destroços
Melhores Futuras
Implementação completa em código
Integração com banco de dados
Interface gráfica ou web
Aplicação de Design Patterns (Fábrica, Fachada)
Autor
Raiza-Nunes yasmithz
