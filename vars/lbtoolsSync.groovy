def call(Map config = [:]) {
    dir("LiquidityBook") {  
        withAWS(region: 'us-east-1', credentials: 'terraform') {       
            script{          
                rabbit = config.containsKey("rabbit") ? config.rabbit : "rabbitmq.prod.dev-lqbk.com"
                command = config.containsKey("command") ? config.command : "hotSync"

                sh "java -jar ./target/helloworld/helloworld.jar"
            }
        }
    }
}
