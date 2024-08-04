https://ubuntu.com/server/docs/install-and-configure-postgresql

https://www.postgresql.org/download/linux/ubuntu/


anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo apt-get update
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo apt install curl ca-certificates
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo install -d /usr/share/postgresql-common/pgdg
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo curl -o /usr/share/postgresql-common/pgdg/apt.postgresql.org.asc --fail https://www.postgresql.org/media/keys/ACCC4CF8.asc
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo sh -c 'echo "deb [signed-by=/usr/share/postgresql-common/pgdg/apt.postgresql.org.asc] https://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo apt update
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo apt install postgresql postgresql-contrib -y

anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo systemctl status postgresql.service
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo systemctl enable postgresql.service
anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ psql --version

anup@infrustructure-management-and-provisioning:~/Jenkins/YEAR2023/TRAINING2023-May13-00$ sudo passwd postgres
New password: 6£t78,(EPHV<
Retype new password: 6£t78,(EPHV<




## Specific version