//定义Jenkins如何自动化部署这个项目; groovy 脚本  gradle（groovy脚本）[maven]
pipeline {
    agent any  //使用任意一个安装了Jenkins的服务器执行下面脚本
    stages {  //定义很多阶段
        stage('项目打包') {
            steps {
                //步骤  mvn clean package
                sh 'echo 项目正在打包'
                withDockerContainer('maven:3.8-openjdk-8') {
                    //在maven中运行以下命令
                    sh 'mvn -v'
                }
            }
        }
        stage('项目测试') {
            steps {
                //
                sh 'echo 项目正在测试'
            }
        }
        stage('项目部署') {
            steps {
                //
                sh 'echo 项目正在部署'
            }
        }
    }
}


