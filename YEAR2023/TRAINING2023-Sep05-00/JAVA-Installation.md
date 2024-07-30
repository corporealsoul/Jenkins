[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo dnf update
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo dnf install java-17-openjdk-devel -y
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo update-alternatives --config 'java'
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ java -version
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ javac -version
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ readlink -f $(which java)
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo nano ~/.bashrc
#JAVA_HOME
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-17.0.10.0.7-2.el9.x86_64         
export PATH="$PATH:$JAVA_HOME/bin"

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ source ~/.bashrc
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ echo $JAVA_HOME
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ echo $PATH
