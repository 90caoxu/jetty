java -Xmx35g -Xms35g -Xmn10g -cp target/jetty-0.0.1-SNAPSHOT.jar:$(for i in target/lib/*.jar ; do echo -n $i: ; done) com.lycos.jetty.HelloWorldServer > out.log