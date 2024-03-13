[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.85/bin/apache-tomcat-9.0.85.tar.gz
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ tar -xvzf apache-tomcat-9.0.85.tar.gz
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ ln -sf apache-tomcat-9.0.85 tomcat-9
[anup@automation-and-continuous-delivery tomcat-9]$ cd tomcat-9/
[anup@automation-and-continuous-delivery tomcat-9]$ nano conf/server.xml
<Server port="9005" shutdown="SHUTDOWN">

    <Connector port="9090" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="9443"
               maxParameterCount="1000"
               />

[anup@automation-and-continuous-delivery tomcat-9]$ sudo nano conf/tomcat-users.xml
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  <user username="admin" password=">+7G4[{aD]H5=" roles="manager-gui, manager-script, manager-jmx, manager-status"/>
  <user username="deployer" password=">+7G4[{aD]H5=" roles="manager-script"/>
  <user username="tomcat" password=">+7G4[{aD]H5=" roles="manager-gui"/>

</tomcat-users>

[anup@automation-and-continuous-delivery tomcat-9]$ sudo nano webapps/manager/META-INF/context.xml
<!--
  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" />
-->

[anup@automation-and-continuous-delivery tomcat-9]$ sudo nano webapps/host-manager/META-INF/context.xml
<!--
  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" />
-->


[anup@automation-and-continuous-delivery tomcat-9]$ sudo firewall-cmd --permanent --add-port=9090/tcp
[anup@automation-and-continuous-delivery tomcat-9]$ sudo firewall-cmd --reload


[anup@automation-and-continuous-delivery tomcat-9]$ ./bin/startup.sh
[anup@automation-and-continuous-delivery tomcat-9]$ ./bin/shutdown.sh

