# EvelynHugoApp

Documentação da API Google Books

URL da documentação: https://developers.google.com/books/docs/v1/getting_started

URL de acesso a API: https://www.googleapis.com/books/v1/

Métodos e dados de autenticação: Para acessar a API do Google Books, é necessário obter uma chave de API válida. A chave pode ser obtida no Console de APIs do Google. Dependendo do método utilizado, pode ser necessária a autenticação OAuth 2.0.

Métodos disponíveis (endpoints):

    -Volumes (/volumes): Este endpoint permite buscar volumes na biblioteca do Google Books, por meio de um termo de pesquisa (q) ou de filtros específicos (filter). É possível definir o tipo de impressão (printType), o nível de detalhamento (projection), o índice do primeiro resultado a ser retornado (startIndex) e o número máximo de resultados a serem retornados (maxResults). Os dados retornados incluem informações sobre os volumes encontrados, como título, autor, editora, descrição, imagem da capa, entre outros.

    -Meus Livros (/mylibrary/bookshelves): Este endpoint permite gerenciar prateleiras de livros personalizadas do usuário. É possível criar, atualizar ou excluir prateleiras, bem como adicionar ou remover volumes de uma prateleira específica. Para realizar essas operações, é necessário passar a identificação da prateleira (shelf) e, em alguns casos, a identificação do volume (volumeId).

    -Minhas Transações (/myconfig/subscription/events): Este endpoint permite receber notificações sobre eventos relacionados à conta do usuário, como alterações em prateleiras de livros, atualizações de comentários ou análises de usuários, entre outros. As notificações são enviadas em formato de fluxo (stream), utilizando o protocolo Server-Sent Events (SSE).

    -Análises de usuários (/reviews): Este endpoint permite buscar comentários e análises de usuários sobre um volume específico. Para isso, é necessário passar a identificação do volume (volumeId) e, opcionalmente, a versão do conteúdo (contentVersion). Os dados retornados incluem informações sobre as análises, como identificação, avaliação, texto, fonte e data de atualização.

    -Livros Gratuitos (/volumes/free): Este endpoint permite buscar volumes gratuitos na biblioteca do Google Books. É possível definir o tipo de impressão (printType), o nível de detalhamento (projection), o índice do primeiro resultado a ser retornado (startIndex) e o número máximo de resultados a serem retornados (maxResults). Os dados retornados incluem informações sobre os volumes encontrados, como título, autor, editora, descrição, imagem da capa, entre outros.


Atributos/parâmetros solicitados por cada método:

Volumes:

-q: Termo de pesquisa
-printType: Tipo de impressão
-projection: Nível de detalhamento
-filter: Filtros
-startIndex: Índice do primeiro resultado a ser retornado
-maxResults: Número máximo de resultados a serem retornados

Meus Livros:
-shelf: Identificação da prateleira
-volumeId: Identificação do volume

Minhas Transações:
-none

Análises de usuários:
-volumeId: Identificação do volume
-contentVersion: Versão do conteúdo

Livros Gratuitos:
-printType: Tipo de impressão
-projection: Nível de detalhamento
-filter: Filtros
-startIndex: Índice do primeiro resultado a ser retornado
-maxResults: Número máximo de resultados a serem retornados
-Nome, identificação, tipo e descrição dos dados retornados para cada método:

Volumes:
-kind: Tipo de recurso (books#volumes)
-items: Lista de volumes retornados

Meus Livros:
-ind: Tipo de recurso (books#bookshelf)
-d: Identificação da prateleira
-elfLink: URL da prateleira
-itle: Título da prateleira
-volumeCount: Número de volumes na prateleira
-volumes: Lista de volumes na prateleira

Minhas Transações:
-kind: Tipo de recurso (books#notification)
-items: Lista de notificações

Análises de usuários:
-kind: Tipo de recurso (books#review)
-id: Identificação da análise
-volumeId: Identificação do volume
-volumeTitle: Título do volume
-rating: Avaliação (1 a 5)
-fullTextUrl: URL do texto completo da análise
-snippet: Trecho da análise
-source: Fonte da análise
-updated: Data da última atualização

Livros Gratuitos:
-kind: Tipo de recurso (books#volumes)
-items: Lista de volumes gratuitos



    VOLUME: LIST - https://www.googleapis.com/books/v1/volumes?q={parâmetros}
      
      *PARÊMETRO OBRIGATÓRIO:
        
        -q (string): Consulta de pesquisa de texto completa;
        
        
      *PARÂMETROS OPCIONAIS:
        
        -download (string): Restringe os volumes de acordo com a disponibilidade de download
           valor do tipo:
              "epub" - todos os valores do tipo EPUB
            
        -filter (string): Filtra os resultados da pesquisa
           valores do tipo:
               "ebooks" - todos os ebooks do Google;
               "free-books" - ebooks do Google com total visibilidade do texto;
               "full" - o volume do texto inteiro fica visível para o público;
               "paid-ebooks" - ebooks do Google com um preço (pago);
               "partial" - os textos são disponíveis para o público ver.
               
               
        -langRestrict (string): Restringe os resultados da busca para algum idiota especifico;
        
        -libraryRestrict (string): Restringe a pesquisa apenas à biblioteca do usuário
            valores do tipo:
                "my-library" - restringe à biblioteca do usuário;
                "no-restrict" - não restringe à biblioteca do usuário.
                
        -maxResults (unsigned integer): Número máximo de resultados que podem ser retornados
            valores: 
                0 a 40;
                
        -orderBy (string): Ordena os resultados da pesquisa
            valores:
                "newest": publicado mais recentemente;
                "relevance": relevância dos termos de pesquisa;
                
        -partner (string): Restringe e gera resultados de marca para o ID do parceiro
        
        -printType (string): Restringe a apenas livros ou revistas
            valores:
                  "all": todos os tipos de conteúdo do volume
		  "books": somente livros
		  "magazines": somente revistas
		  
        -projection (string): Restringe as informações retornadas a um conjunto de campos selecionados
	    valores:
	    	"full": inclui todos os dados de volume
		"lite": inclui um subconjunto de campos em volumeInfor e acessInfo

        -showPreorders (boolean): Se definido como "true", é possível ver os livros disponíveis para pré-venda. (Por padrão é "false")

        -source (string): String para identificar o criador da solicitação
	
        -startIndex (insugned integer): Índice do primeiro resultado a ser retomado (inicia em 0)
	
	
	
	Volume: Get - GET https://www.googleapis.com/books/v1/volumes/volumeId

	Parâmetros obrigatórios:
	•	volumeId (string): Id do volume a ser recuperado; 

	Parâmetros opcionais:
	•	partner (string): Resultados de marca para o Id do parceiro;

	•	projection (string): Restrinja as informações retornadas a um conjunto de campos selecionados;
	Os valores aceitáveis são:
				"full": inclui todos os dados de volume.
				"lite": inclui um subconjunto de campos em volumeInfo e accessInfo.

	•	Source (string) String para identficar o criador da solicitação. 

	Resposta: Se for bem-sucedido, este método retornará um recurso Volume no corpo da resposta.

