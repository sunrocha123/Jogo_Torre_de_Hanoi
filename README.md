#Nome do Projeto

Torre de Hanoi

#Descrição

Este projeto tem como foco exibir as movimentações necessárias, para transferir a quantidade de discos informados pelo usuário da haste A para a C, usando a haste B como apoio. Lembrando que o número de discos precisa ser inteiro e maior que 0.

#Compilação e execução do programa

Para execução do programa, é necessário seguir os passos abaixo:

#1. Verificar se o JAVAC está configurado no computador.

Para realizar esta verificação, basta acessar a prompt de comando da máquina e digitar javac.
Caso apareça a mensagem "javac is not recognized as an internal or external command...", será necessário configurá-lo.

    #Passo-a-passo para configurar o javac:

    * Acesse o site https://www.oracle.com/java/technologies/javase-jdk15-downloads.html e faça o download do Java SE Development Kit. (JDK)
    * Depois de baixar os arquivos necessários, acesse em sua máquina painel de controle > sistema e segurança > sistema > configurações avançadas do sistema > Variáveis de Ambiente
    * Em variáveis de ambiente, clique em novo. No nome da variável, insira "JAVA_HOME" e no valor da variável, insira o caminho da pasta bin que fica dentro da pasta JDK.
    * Logo depois, procure em variávies do sistema a variável path.
    * Achando-a, clique em editar > novo e insira o caminho da pasta bin mencionado acima. Depois disso, clique em cima do caminho adicionado e mova para cima até ficar no topo da lista.
    * Depois, clique em OK em todas as janelas.
    * Acesse a prompt de comando novamente e digite javac. Caso carregue o arquivo, podemos concluir que o mesmo foi configurado com sucesso!

#2. Executando/Compilando o programa

*Depois de configurar o javac com sucesso, acesse o caminho aonde está o programa, usando o comando "cd + caminho".
    Ex. cd Downloads

*Após acessar o caminho, digite o comando "dir" para validar se o arquivo do jogo está dentro do diretório selecionado.

*O arquivo estando no local correto, digitaremos o comando "javac -d bin 'arquivo do jogo(.java)'".
    Ex. javac -d bin TorreDeHanoi.java

*No passo seguinte, digitaremos o comando "java -cp bin + (arquivo do jogo).
    Ex. java -cp bin TorreDeHanoi
    OBS. Não precisa incluir a extensão .java

Pronto! Seu programa será executado com sucesso!!


#Autores

Judson Rodrigues Santana | RGM 23457449


