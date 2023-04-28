# code-lab-2-atividade2-espm

Trabalho em grupo da atividade de Estruturas de Dados da ESPM

## Resolução

Nosso código Java implementa um simulador de um sistema de atendimento de transações. O sistema consiste em usar o método de programação "fila", justamente, para simular uma fila de transações com três caixas eletrônicos que atendem ela. Cada transação é identificada por um código e um tempo de duração e espera do cliente.
Ao final do seu funcionamento, o programa informa o expediente (é definido pelo usuário e controlado pelo cronômetro). Além de mostrar o tempo médio de espera do cliente na fila, mostra qaunats vezes cada transação foi feita, quantos clientes foram atendidos e quantos clientes não foram atendidos.

No método principal do programa "inicializar():", ele solicita ao usuário o tempo limite para executar a simulação e a quantidade de transações a serem processadas. Depois disso, ele inicializa a fila de transações, simula o atendimento das transações pela fila de caixas e exibe o relatório de desempenho e duração.

mostrarRelatorio(): esse método exibe um relatório de desempenho do sistema na interface. Também, exibe a quantidade de clientes atendidos, a quantidade de clientes não atendidos, o tempo médio de espera na fila e a quantidade de transações efetuadas.

simular(int limiteTempo): Nesse método, é simulado o atendimento das transações pelos caixas eletrônicos. Ele executa um loop de tempo, em que cada iteração do loop representa a duraçaõ da transação(em segundos). Nas iterações do loop, ele verifica se algum caixa eletrônico está livre para atender uma transação. Se houver um caixa livre e houver uma transação na fila(cliente), ele atende a transação, atualiza o tempo de liberação do caixa e registra a transação no mapa de códigos de transação.

popularFila(int quantidadeTransacoes): esse método preenche fila de transações com a quantidade de transações especificada. Ele gera um código de transação aleatório e adiciona uma nova transação com esse código na fila.

O programa também define duas demais classes, Caixa e Transacao, que representam os caixas eletrônicos e as transações. Essas classes contêm propriedades e métodos simples para armazenar e manipular informações.

Além disso, o programa utiliza a biblioteca javax.swing.JOptionPane para exibir caixas de diálogo na interface gráfica. Ele também importa a classe java.util.* para utilizar as classes Queue e LinkedList.
