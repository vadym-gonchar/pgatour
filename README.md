How to connect your local project folder to your empty repository on Github:

1) Create an empty Git repository on GitHub (without README.md) and name it like your local project,

2) Write the code in the INTELLIJ IDEA, then launch a terminal, and in your project do the following commands:

git init

git remote add origin https://github.com/vadym-gonchar/pgatour.git

git add .

git commit -m "initial commit"

git push -u origin master

To run the tests:

**mvn clean package -DrunnerFile=testng -Dbrowser=CHROME**