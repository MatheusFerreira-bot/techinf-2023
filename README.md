# Exercícios do Curso de Técnico em Informática - SENAC Goiás.

## Comandos para se utilizar o Git:

> [!WARNING]
> **ESTE DOCUMENTO SERÁ ATUALIZADO REGULARMENTE. ESTAREI MODIFICANDO O DOCUMENTO SEMPRE QUE APRENDER ALGO NOVO!**

### 1. git init
- Git commit se compromete com as modificações que foram adicionadas e gera um commit, que é um conjunto das diferenças existentes em relação a um commit anterior na árvore de versionamento.
Uma vez "commitado" o código, ele é "escrito em pedra". Você não apaga mais aquele commit, em princípio, e pode acessá-lo novamente caso haja um branch (espécie de rótulo que indica um ramo) apontando para o mesmo ou para um de seus commits-filhos, ou se souber os primeiros dígitos do hash (código hexadecimal) que representa aquele commit.

### 2. git commit -m "Primeiro Commit."
- Adiciona todos os arquivos modificados na área de stage e, em seguida, faz o commit dos mesmos.

### 3. git fetch 
- Basicamente ele atualiza as referências locais com relações às remotas, mas não faz o merge com o branch (espécie de rótulo que indica um ramo) local.

### 4. git pull
- Basicamente incorpora mudanças de um repositório remoto para o branch (espécie de rótulo que indica um ramo) local.

### 5. git status
- Exibe informações sobre o estado atual do seu repositório. Ele lista todos os arquivos que foram modificados, excluídos ou não rastreados desde o último commit.

### 6. git log
- É uma ferramenta poderosa no Git que permite visualizar o histórico de commits de um repositório. Com ele, é possível obter uma visão geral do desenvolvimento do projeto, rastrear as alterações feitas e identificar quando e por quem certas alterações foram realizadas.
