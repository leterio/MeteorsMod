[![Build Status](https://travis-ci.org/leterio/MeteorsMod.svg?branch=1.12.2)](https://travis-ci.org/leterio/MeteorsMod)

Este projeto ainda está em fase inicial de desenvolvimento. Por favor, acompanhe para ter mais informações.
Não aceitarei Merge Requests até o primeiro release. Caso ainda deseje rodar o mod e encontar algum bug, sinta-se a vontade para abrir uma Issue.

# Meteors Mod
Esta modificação para Minecraft adiciona uma nova experiência ao jogador, fazendo com que meteoros caiam do céu.

Os meteoros trazem ao mundo novos minerais:
- *Meteorite*
	- O Set de *Meteorite* e suas ferramentas tem um efeito magnético, atraindo os itens que estiverem jogados ao redor do jogador
- *Kreknorite*
	- O Set de *Kreknorite* permite ao jogador atravessar áreas quentes sem tomar dano (literalmente nadar na lava).
- Frezarite
	- TBD

Todas as ferramentas tem durabilidade e iguais as ferramentas de ferro (TBAdjusted).

Mas e se um meteoro atingir minha casa??
Não se preocupe, após achar as gemas raras de meteoros, você pode levantar um campo de força ao entorno de suas construções.

## Configuração para desenvolvimento
##### Pré-requisitos
1. Tenha certeza que possui uma (JDK 8)[https://www.oracle.com/technetwork/java/javase/downloads/index.html] instalada em sua máquina
2. Você precisará de uma IDE para modificar o mod. Recomendo fortemente o [Eclipse](https://www.eclipse.org/downloads/) pela sua simplicidade e facilidade.

##### Mão na massa
1. Crie um diretório base para fazer o clone do repositório.
	1.1 Após clonar, verá, em seu diretório base, o diretório MeteorsMod, acesse-o.
2. Caso esteja usando Windows, ao ler "./gradlew", digite "gradlew.bat"
3. Efetue a configuração do ambiente desobfuscado do Minecraft:
`./gradlew setupDecompWorkspace`
4. Com isso, caso realmente tenha utilizado o Eclipse como IDE, execute:
`./gradlew eclipse`
    4.1. Desta forma, agora poderá importar o projeto no eclipse.
5. Para testar as alterações que efetuou, você precisará rodar o jogo. Pelo eclipse:
    5.1. No explorador de aruivos, por dois arquivos com a extenção .launch.
        5.1.1. O arquivo MeteorsMod_Client.launch irá iniciar o Client do jogo.
        5.1.2. O arquivo MeteorsMod_Server.launch irá iniciar o Servidor.
    5.2. Para executar o arquivo .launch:
        5.2.1. Clique com o botão direito no mesmo, pelo Eclipse.
        5.2.2. Aponte pro item "Debug As"
        5.2.3. Clique no primeiro item da lista, que deverá estar com o mesmo nome do arquivo na qual clicou no passo 5.2.1, mas sem a extenção;
6. Para gerar uma versão do mod, execute:
`./gradlew build`

O arquivo .jar do mod estará no diretório buid/libs
Basta copia-lo para a pasta mods do seu jogo (apenas o arquivo sem o texto "sources" no nome).

## Tradução para seu idioma
TODO

## Nunca mexi com mods, o que fazer???
Sugiro procurar alguns tutorias na internet e a ler o site do [Forge](https://mcforge.readthedocs.io/en/latest/), além de ter noções de programação.


---
Baseado no mod [Falling Meteors mod](https://github.com/AlexDGr8r/MeteorsMod) (de [AlexDGr8r](https://github.com/AlexDGr8r))
O mod citado não é mais mantido pelo autor.
O mod presente neste repositório utiliza as mesmas artes de textura que o mod na qual é baseado.
