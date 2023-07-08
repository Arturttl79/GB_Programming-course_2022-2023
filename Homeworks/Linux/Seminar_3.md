arturttl79@artur-pc:~/Lesson3$ cat file1 <
-bash: syntax error near unexpected token `newline'
arturttl79@artur-pc:~/Lesson3$ cat file1 >
-bash: syntax error near unexpected token `newline'
arturttl79@artur-pc:~/Lesson3$ cat > file1
123
sad
xczc
nfkdlan,.
wkhioklwqwn
arturttl79@artur-pc:~/Lesson3$ cat > file2
sads
file2
is  
this
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:06 ../
-rw-rw-r-- 1 arturttl79 arturttl79   35 Jul  8 15:07 file1
-rw-rw-r-- 1 arturttl79 arturttl79   19 Jul  8 15:07 file2
arturttl79@artur-pc:~/Lesson3$ cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-network:x:101:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:102:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:104::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:104:105:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
pollinate:x:105:1::/var/cache/pollinate:/bin/false
sshd:x:106:65534::/run/sshd:/usr/sbin/nologin
syslog:x:107:113::/home/syslog:/usr/sbin/nologin
uuidd:x:108:114::/run/uuidd:/usr/sbin/nologin
tcpdump:x:109:115::/nonexistent:/usr/sbin/nologin
tss:x:110:116:TPM software stack,,,:/var/lib/tpm:/bin/false
landscape:x:111:117::/var/lib/landscape:/usr/sbin/nologin
fwupd-refresh:x:112:118:fwupd-refresh user,,,:/run/systemd:/usr/sbin/nologin
arturttl79:x:1000:1000:Artur:/home/arturttl79:/bin/bash
lxd:x:999:100::/var/snap/lxd/common/lxd:/bin/false
arturttl79@artur-pc:~/Lesson3$ chmod u=rw, g-rw, o-r file2
chmod: invalid mode: ‘u=rw,’
Try 'chmod --help' for more information.
arturttl79@artur-pc:~/Lesson3$ chmod g-rw, o-r file2
chmod: invalid mode: ‘g-rw,’
Try 'chmod --help' for more information.
arturttl79@artur-pc:~/Lesson3$ sudo chmod u=rw, g-rw, o-r file2
[sudo] password for arturttl79: 
chmod: invalid mode: ‘u=rw,’
Try 'chmod --help' for more information.
arturttl79@artur-pc:~/Lesson3$ man chmod
arturttl79@artur-pc:~/Lesson3$ chmod g-rw,o-r file2
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ../
-rw-rw-r-- 1 arturttl79 arturttl79   35 Jul  8 15:07 file1
-rw------- 1 arturttl79 arturttl79   19 Jul  8 15:07 file2
arturttl79@artur-pc:~/Lesson3$ chmod 777 file2
arturttl79@artur-pc:~/Lesson3$ chmod 555 file1
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ../
-r-xr-xr-x 1 arturttl79 arturttl79   35 Jul  8 15:07 file1*
-rwxrwxrwx 1 arturttl79 arturttl79   19 Jul  8 15:07 file2*
arturttl79@artur-pc:~/Lesson3$ cat file1
123
sad
xczc
nfkdlan,.
wkhioklwqwn
arturttl79@artur-pc:~/Lesson3$ chmod 664 file1
arturttl79@artur-pc:~/Lesson3$ chmod 600 file2
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ../
-rw-rw-r-- 1 arturttl79 arturttl79   35 Jul  8 15:07 file1
-rw------- 1 arturttl79 arturttl79   19 Jul  8 15:07 file2
arturttl79@artur-pc:~/Lesson3$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~/Lesson3$ chown proxy:proxy /home/arturttl79/Lesson3
chown: changing ownership of '/home/arturttl79/Lesson3': Operation not permitted
arturttl79@artur-pc:~/Lesson3$ chown proxy:proxy /home/arturttl79/Lesson3/
chown: changing ownership of '/home/arturttl79/Lesson3/': Operation not permitted
arturttl79@artur-pc:~/Lesson3$ sudo chown proxy:proxy /home/arturttl79/Lesson3/
[sudo] password for arturttl79: 
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 proxy      proxy      4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ../
-rw-rw-r-- 1 arturttl79 arturttl79   35 Jul  8 15:07 file1
-rw------- 1 arturttl79 arturttl79   19 Jul  8 15:07 file2
arturttl79@artur-pc:~/Lesson3$ sudo chown proxy:proxy /home/arturttl79/Lesson3 -R
arturttl79@artur-pc:~/Lesson3$ ll
total 16
drwxrwxr-x 2 proxy      proxy      4096 Jul  8 15:07 ./
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ../
-rw-rw-r-- 1 proxy      proxy        35 Jul  8 15:07 file1
-rw------- 1 proxy      proxy        19 Jul  8 15:07 file2
arturttl79@artur-pc:~/Lesson3$ cd ..
arturttl79@artur-pc:~$ ll
total 60
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 15:54 ./
drwxr-xr-x 3 root       root       4096 Jun 27 20:17 ../
-rw------- 1 arturttl79 arturttl79 2593 Jul  5 22:31 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79  220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79 3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79 4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79   20 Jul  8 15:54 .lesshst
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79  807 Jan  6  2022 .profile
drwx------ 2 arturttl79 arturttl79 4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79    0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 7973 Jul  3 22:07 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy      4096 Jul  8 15:07 Lesson3/
-rw-rw-r-- 1 arturttl79 arturttl79    0 Jul  3 21:55 mytextfile.txt
arturttl79@artur-pc:~$ cd Lesson3
arturttl79@artur-pc:~/Lesson3$ man useradd
arturttl79@artur-pc:~/Lesson3$ sudo useradd -s /bin/bash -m -d
useradd: option requires an argument -- 'd'
Usage: useradd [options] LOGIN
       useradd -D
       useradd -D [options]

Options:
      --badnames                do not check for bad names
  -b, --base-dir BASE_DIR       base directory for the home directory of the
                                new account
      --btrfs-subvolume-home    use BTRFS subvolume for home directory
  -c, --comment COMMENT         GECOS field of the new account
  -d, --home-dir HOME_DIR       home directory of the new account
  -D, --defaults                print or change default useradd configuration
  -e, --expiredate EXPIRE_DATE  expiration date of the new account
  -f, --inactive INACTIVE       password inactivity period of the new account
  -g, --gid GROUP               name or ID of the primary group of the new
                                account
  -G, --groups GROUPS           list of supplementary groups of the new
                                account
  -h, --help                    display this help message and exit
  -k, --skel SKEL_DIR           use this alternative skeleton directory
  -K, --key KEY=VALUE           override /etc/login.defs defaults
  -l, --no-log-init             do not add the user to the lastlog and
                                faillog databases
  -m, --create-home             create the user's home directory
  -M, --no-create-home          do not create the user's home directory
  -N, --no-user-group           do not create a group with the same name as
                                the user
  -o, --non-unique              allow to create users with duplicate
                                (non-unique) UID
  -p, --password PASSWORD       encrypted password of the new account
  -r, --system                  create a system account
  -R, --root CHROOT_DIR         directory to chroot into
  -P, --prefix PREFIX_DIR       prefix directory where are located the /etc/* files
  -s, --shell SHELL             login shell of the new account
  -u, --uid UID                 user ID of the new account
  -U, --user-group              create a group with the same name as the user
  -Z, --selinux-user SEUSER     use a specific SEUSER for the SELinux user mapping
      --extrausers              Use the extra users database

arturttl79@artur-pc:~/Lesson3$ sudo useradd -s /bin/bash -m -d home/testuser1 testuser1
useradd: invalid home directory 'home/testuser1'
arturttl79@artur-pc:~/Lesson3$ sudo useradd -s /bin/bash -m -d /home/testuser1 testuser1
arturttl79@artur-pc:~/Lesson3$ cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-network:x:101:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:102:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:104::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:104:105:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
pollinate:x:105:1::/var/cache/pollinate:/bin/false
sshd:x:106:65534::/run/sshd:/usr/sbin/nologin
syslog:x:107:113::/home/syslog:/usr/sbin/nologin
uuidd:x:108:114::/run/uuidd:/usr/sbin/nologin
tcpdump:x:109:115::/nonexistent:/usr/sbin/nologin
tss:x:110:116:TPM software stack,,,:/var/lib/tpm:/bin/false
landscape:x:111:117::/var/lib/landscape:/usr/sbin/nologin
fwupd-refresh:x:112:118:fwupd-refresh user,,,:/run/systemd:/usr/sbin/nologin
arturttl79:x:1000:1000:Artur:/home/arturttl79:/bin/bash
lxd:x:999:100::/var/snap/lxd/common/lxd:/bin/false
testuser1:x:1001:1001::/home/testuser1:/bin/bash
arturttl79@artur-pc:~/Lesson3$ cd ~
arturttl79@artur-pc:~$ ll
total 60
drwxr-x--- 8 arturttl79 arturttl79 4096 Jul  8 17:26 ./
drwxr-xr-x 4 root       root       4096 Jul  8 17:27 ../
-rw------- 1 arturttl79 arturttl79 2593 Jul  5 22:31 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79  220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79 3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79 4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79   20 Jul  8 17:26 .lesshst
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79  807 Jan  6  2022 .profile
drwx------ 2 arturttl79 arturttl79 4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79    0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 7973 Jul  3 22:07 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy      4096 Jul  8 15:07 Lesson3/
-rw-rw-r-- 1 arturttl79 arturttl79    0 Jul  3 21:55 mytextfile.txt
arturttl79@artur-pc:~$ cd ..
arturttl79@artur-pc:/home$ cd
arturttl79@artur-pc:~$ cd adduser
-bash: cd: adduser: No such file or directory
arturttl79@artur-pc:~$ sudo adduser
adduser: Only one or two names allowed.
arturttl79@artur-pc:~$ sudo adduser testuser2
Adding user `testuser2' ...
Adding new group `testuser2' (1002) ...
Adding new user `testuser2' (1002) with group `testuser2' ...
Creating home directory `/home/testuser2' ...
Copying files from `/etc/skel' ...
New password: 
Retype new password: 
passwd: password updated successfully
Changing the user information for testuser2
Enter the new value, or press ENTER for the default
	Full Name []: Artur
	Room Number []: 455
	Work Phone []: +905364540490
	Home Phone []: +79196993887
	Other []: 
Is the information correct? [Y/n] y
arturttl79@artur-pc:~$ cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-network:x:101:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:102:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:104::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:104:105:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
pollinate:x:105:1::/var/cache/pollinate:/bin/false
sshd:x:106:65534::/run/sshd:/usr/sbin/nologin
syslog:x:107:113::/home/syslog:/usr/sbin/nologin
uuidd:x:108:114::/run/uuidd:/usr/sbin/nologin
tcpdump:x:109:115::/nonexistent:/usr/sbin/nologin
tss:x:110:116:TPM software stack,,,:/var/lib/tpm:/bin/false
landscape:x:111:117::/var/lib/landscape:/usr/sbin/nologin
fwupd-refresh:x:112:118:fwupd-refresh user,,,:/run/systemd:/usr/sbin/nologin
arturttl79:x:1000:1000:Artur:/home/arturttl79:/bin/bash
lxd:x:999:100::/var/snap/lxd/common/lxd:/bin/false
testuser1:x:1001:1001::/home/testuser1:/bin/bash
testuser2:x:1002:1002:Artur,455,+905364540490,+79196993887:/home/testuser2:/bin/bash
arturttl79@artur-pc:~$ sudo userdel testuser2
arturttl79@artur-pc:~$ cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-network:x:101:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:102:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:104::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:104:105:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
pollinate:x:105:1::/var/cache/pollinate:/bin/false
sshd:x:106:65534::/run/sshd:/usr/sbin/nologin
syslog:x:107:113::/home/syslog:/usr/sbin/nologin
uuidd:x:108:114::/run/uuidd:/usr/sbin/nologin
tcpdump:x:109:115::/nonexistent:/usr/sbin/nologin
tss:x:110:116:TPM software stack,,,:/var/lib/tpm:/bin/false
landscape:x:111:117::/var/lib/landscape:/usr/sbin/nologin
fwupd-refresh:x:112:118:fwupd-refresh user,,,:/run/systemd:/usr/sbin/nologin
arturttl79:x:1000:1000:Artur:/home/arturttl79:/bin/bash
lxd:x:999:100::/var/snap/lxd/common/lxd:/bin/false
testuser1:x:1001:1001::/home/testuser1:/bin/bash
arturttl79@artur-pc:~$ cd /home/
arturttl79@artur-pc:/home$ ll
total 20
drwxr-xr-x  5 root       root       4096 Jul  8 17:30 ./
drwxr-xr-x 19 root       root       4096 Jun 27 20:14 ../
drwxr-x---  8 arturttl79 arturttl79 4096 Jul  8 17:26 arturttl79/
drwxr-x---  2 testuser1  testuser1  4096 Jul  8 17:27 testuser1/
drwxr-x---  2       1002       1002 4096 Jul  8 17:30 testuser2/
arturttl79@artur-pc:/home$ cd ~
arturttl79@artur-pc:~$ sudo groupadd testgroup
arturttl79@artur-pc:~$ cat /etc/group/
cat: /etc/group/: Not a directory
arturttl79@artur-pc:~$ cat /etc/group
root:x:0:
daemon:x:1:
bin:x:2:
sys:x:3:
adm:x:4:syslog,arturttl79
tty:x:5:
disk:x:6:
lp:x:7:
mail:x:8:
news:x:9:
uucp:x:10:
man:x:12:
proxy:x:13:
kmem:x:15:
dialout:x:20:
fax:x:21:
voice:x:22:
cdrom:x:24:arturttl79
floppy:x:25:
tape:x:26:
sudo:x:27:arturttl79
audio:x:29:
dip:x:30:arturttl79
www-data:x:33:
backup:x:34:
operator:x:37:
list:x:38:
irc:x:39:
src:x:40:
gnats:x:41:
shadow:x:42:
utmp:x:43:
video:x:44:
sasl:x:45:
plugdev:x:46:arturttl79
staff:x:50:
games:x:60:
users:x:100:
nogroup:x:65534:
systemd-journal:x:101:
systemd-network:x:102:
systemd-resolve:x:103:
messagebus:x:104:
systemd-timesync:x:105:
input:x:106:
sgx:x:107:
kvm:x:108:
render:x:109:
lxd:x:110:arturttl79
_ssh:x:111:
crontab:x:112:
syslog:x:113:
uuidd:x:114:
tcpdump:x:115:
tss:x:116:
landscape:x:117:
fwupd-refresh:x:118:
arturttl79:x:1000:
testuser1:x:1001:
testgroup:x:1002:
arturttl79@artur-pc:~$ sudo addgroup testgroup2
[sudo] password for arturttl79: 
Adding group `testgroup2' (GID 1003) ...
Done.
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ sudo usermod -aG testuser1 arturttl79
arturttl79@artur-pc:~$ sudo usermod -aG testgroup arturttl79
arturttl79@artur-pc:~$ sudo usermod -aG testgroup2 arturttl79
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ id testuser1
uid=1001(testuser1) gid=1001(testuser1) groups=1001(testuser1)
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ sudo usermod -aG testgroup arturttl79
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ cat /etc/group
root:x:0:
daemon:x:1:
bin:x:2:
sys:x:3:
adm:x:4:syslog,arturttl79
tty:x:5:
disk:x:6:
lp:x:7:
mail:x:8:
news:x:9:
uucp:x:10:
man:x:12:
proxy:x:13:
kmem:x:15:
dialout:x:20:
fax:x:21:
voice:x:22:
cdrom:x:24:arturttl79
floppy:x:25:
tape:x:26:
sudo:x:27:arturttl79
audio:x:29:
dip:x:30:arturttl79
www-data:x:33:
backup:x:34:
operator:x:37:
list:x:38:
irc:x:39:
src:x:40:
gnats:x:41:
shadow:x:42:
utmp:x:43:
video:x:44:
sasl:x:45:
plugdev:x:46:arturttl79
staff:x:50:
games:x:60:
users:x:100:
nogroup:x:65534:
systemd-journal:x:101:
systemd-network:x:102:
systemd-resolve:x:103:
messagebus:x:104:
systemd-timesync:x:105:
input:x:106:
sgx:x:107:
kvm:x:108:
render:x:109:
lxd:x:110:arturttl79
_ssh:x:111:
crontab:x:112:
syslog:x:113:
uuidd:x:114:
tcpdump:x:115:
tss:x:116:
landscape:x:117:
fwupd-refresh:x:118:
arturttl79:x:1000:
testuser1:x:1001:arturttl79
testgroup:x:1002:arturttl79
testgroup2:x:1003:arturttl79
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ sudo su
root@artur-pc:/home/arturttl79# exit
exit
arturttl79@artur-pc:~$ id
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd)
arturttl79@artur-pc:~$ sudo usermod -aG testgroup testuser1
arturttl79@artur-pc:~$ sudo id testuser1
uid=1001(testuser1) gid=1001(testuser1) groups=1001(testuser1),1002(testgroup)
arturttl79@artur-pc:~$ sudo usermod -g testgroup2 testuser1
arturttl79@artur-pc:~$ sudo id testuser1
uid=1001(testuser1) gid=1003(testgroup2) groups=1003(testgroup2),1002(testgroup)
arturttl79@artur-pc:~$ man useradd
arturttl79@artur-pc:~$ sudo usermod -aG sudo testuser1
arturttl79@artur-pc:~$ sudo id testuser1
uid=1001(testuser1) gid=1003(testgroup2) groups=1003(testgroup2),27(sudo),1002(testgroup)
arturttl79@artur-pc:~$ sudo id root
uid=0(root) gid=0(root) groups=0(root)
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ su testuser1
Password: 
su: Authentication failure
arturttl79@artur-pc:~$ sudo passwd testuser1
New password: 
Retype new password: 
passwd: password updated successfully
arturttl79@artur-pc:~$ su testuser1
Password: 
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

testuser1@artur-pc:/home/arturttl79$ sudo su testuser1
[sudo] password for testuser1: 
testuser1@artur-pc:/home/arturttl79$ id
uid=1001(testuser1) gid=1003(testgroup2) groups=1003(testgroup2),27(sudo),1002(testgroup)
testuser1@artur-pc:/home/arturttl79$ sudo id arturttl79
[sudo] password for testuser1: 
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd),1001(testuser1),1002(testgroup),1003(testgroup2)
testuser1@artur-pc:/home/arturttl79$ testuser1 ALL=(ALL) NOPASSWD:ALL
bash: syntax error near unexpected token `('
testuser1@artur-pc:/home/arturttl79$ testuser1 ALL=(ALL)NOPASSWD:ALL
bash: syntax error near unexpected token `('
testuser1@artur-pc:/home/arturttl79$ testuser1 ALL=(ALL) NOPASSWD: ALL
bash: syntax error near unexpected token `('
testuser1@artur-pc:/home/arturttl79$ sudo testuser1 ALL=(ALL) NOPASSWD: ALL
bash: syntax error near unexpected token `('
testuser1@artur-pc:/home/arturttl79$ sudo visudo
visudo: /etc/sudoers.tmp unchanged
testuser1@artur-pc:/home/arturttl79$ su arturttl79
Password: 
arturttl79@artur-pc:~$ su testuser1
Password: 
testuser1@artur-pc:/home/arturttl79$ cd ~
testuser1@artur-pc:~$ sudo visudo
testuser1@artur-pc:~$ sudo visudo
visudo: /etc/sudoers.tmp unchanged
testuser1@artur-pc:~$ sudo id arturttl79
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd),1001(testuser1),1002(testgroup),1003(testgroup2)
testuser1@artur-pc:~$ 
testuser1@artur-pc:~$ sudo visudo
testuser1@artur-pc:~$ sudo visudo
visudo: /etc/sudoers.tmp unchanged
testuser1@artur-pc:~$ sudo id arturttl79
uid=1000(arturttl79) gid=1000(arturttl79) groups=1000(arturttl79),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),110(lxd),1001(testuser1),1002(testgroup),1003(testgroup2)
testuser1@artur-pc:~$ su arturttl79
Password: 
arturttl79@artur-pc:/home/testuser1$ 