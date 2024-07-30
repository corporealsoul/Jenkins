https://ubuntu.com/server/docs/install-and-configure-postgresql


anup@infrustructure-management-and-provisioning:~$ sudo apt update
anup@infrustructure-management-and-provisioning:~$ sudo apt install postgresql postgresql-contrib

anup@infrustructure-management-and-provisioning:~$ sudo systemctl status postgresql.service
anup@infrustructure-management-and-provisioning:~$ sudo systemctl enable postgresql.service

anup@infrustructure-management-and-provisioning:~$ psql --version

anup@infrustructure-management-and-provisioning:~$ sudo passwd postgres
New password: 6£t78,(EPHV<
Retype new password: 6£t78,(EPHV<


