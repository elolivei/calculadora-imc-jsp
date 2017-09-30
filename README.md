### calculadora-imc-jsp

#### Como o projeto foi criado
`mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp -DgroupId=lab -DartifactId=lab-backend -DinteractiveMode=false`
"Embutindo" o Maven. Para que não seja necessário instalar e configurar o Maven, ele foi embutido no projeto com o seguinte comando:
`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`

#### Para construir o projeto
`mvn clean package`

#### Para rodar o projeto no Tomcat
`mvn tomcat7:run`

#### Enviando para o gitHub
"Crie um repositório no GitHub. Para evitar erros,não inicialize o novo repositório com os arquivos README, license ou gitignore. 
Você pode adicionar esses arquivos depois que seu projejo for enviado para o GitHub."

#### Abra o terminal

#### Mude o diretório corrente para o local do seu projeto.

#### Inicialise o diretório local como um respositório Git.
`git init`

#### Adicione os arquivos no seu novo diretório local.
`git add`
Para inutilizar o arquivo, use:
`git reset HEAD YOUR-FILE`

#### Commit os arquivos que você adicionou no repositório.
`git commit -m "Primeiro commit"`

#### Caso seu usuário não esteja configurado utilize os seguintes comandos:
`git config user.email "seuemail@provedor"`
`git config user.name "nome_do_usuario_git"`
Para remover esse commit e modificar o arquivo, use:
`git reset --soft HEAD~1`
`commit`
`add` 
Para comitar o arquivo novamente.

#### Adicionando a url remota do GitHub.
`git remote add origin "url do repositório no GitHub"`

#### Verifique a nova URL remota
`git remote -v`

#### Envie as alterações do seu repositório local para o repositório remoto no GitHub.
`git push origin master`