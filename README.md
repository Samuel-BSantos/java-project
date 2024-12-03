# Integrantes do Grupo

- Samuel Benjamim
- Idinaldo Oliveira
- Paulo Henrique


# Resumo do código/diagrama


## A Classe Produto e Suas (Classes) Filhas

A classe _produto_ é a classe mãe de três outras classes (Notebook, PC e Celular). Por quê? Porque esses produtos devem herdar diversos atributos em comum, por exemplo: Nome, Marca e Sistema_Operacional. Entendemos que a _produto_ é uma entidade fundamental e deve ser usada como classe mãe. Todas as classes filhas que herdam (diretamente) algo da classe _Produto_ são produtos.


## A Classe Celular e Suas Associações

A classe _celular_ tem a classe _câmeras_ como associação (composição), Essa relação (toda-parte forte) se dá ao fato de não termos, nos dias atuais, celulares sem câmeras. Como nosso software se trata de uma loja de venda de tecnologia é ilógico vender dispositivos celulares sem câmera. Portanto, composição.


## A Classe _Mouse_ e suas Associações

A classe _mouse_ é associada à duas outras classes (Notebook e PC), com as quais têm uma relação de agregação. Por quê? Nós sabemos que todo (ou a gigantesca maioria) notebook ten um touchpad que dispensa o uso de um mouse. Enquanto os PCs são utilizados para processamento de dados, host de plataformas web, etc. Sendo assim, o uso de mouse nesses dispositivos eletrônicos é dispensável nos mais variaáos casos.