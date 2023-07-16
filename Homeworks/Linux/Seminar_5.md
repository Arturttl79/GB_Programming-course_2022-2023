arturttl79@artur-pc:~$ crontab -e
crontab: installing new crontab
arturttl79@artur-pc:~$ crontab -l
# Edit this file to introduce tasks to be run by cron.
# 
# Each task to run has to be defined through a single line
# indicating with different fields when the task will be run
# and what command to run for the task
# 
# To define the time you can provide concrete values for
# minute (m), hour (h), day of month (dom), month (mon),
# and day of week (dow) or use '*' in these fields (for 'any').
# 
# Notice that tasks will be started based on the cron's system
# daemon's notion of time and timezones.
# 
# Output of the crontab jobs (including errors) is sent through
# email to the user the crontab file belongs to (unless redirected).
# 
# For example, you can run a backup of all your user accounts
# at 5 a.m every week with:
*/3 * * * * mkdir /home/arturttl79/test_folder
*/3 * * * * cat >> test.md "Just for test" || touch test.md
# 
# For more information see the manual pages of crontab(5) and cron(8)
# 
# m h  dom mon dow   command
arturttl79@artur-pc:~$ ll
total 80
drwxr-x--- 9 arturttl79 arturttl79  4096 Jul 16 21:27 ./
drwxr-xr-x 5 root       root        4096 Jul  8 17:30 ../
-rw------- 1 arturttl79 arturttl79  9051 Jul 16 20:25 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79   220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79  3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79  4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79    20 Jul 16 21:23 .lesshst
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79   807 Jan  6  2022 .profile
-rw-rw-r-- 1 arturttl79 arturttl79    66 Jul 16 21:11 .selected_editor
drwx------ 2 arturttl79 arturttl79  4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79     0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 10646 Jul 10 21:34 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy       4096 Jul  8 15:07 Lesson3/
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul 10 21:15 Lesson4/
arturttl79@artur-pc:~$ ll
total 80
drwxr-x--- 9 arturttl79 arturttl79  4096 Jul 16 21:27 ./
drwxr-xr-x 5 root       root        4096 Jul  8 17:30 ../
-rw------- 1 arturttl79 arturttl79  9051 Jul 16 20:25 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79   220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79  3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79  4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79    20 Jul 16 21:23 .lesshst
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79   807 Jan  6  2022 .profile
-rw-rw-r-- 1 arturttl79 arturttl79    66 Jul 16 21:11 .selected_editor
drwx------ 2 arturttl79 arturttl79  4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79     0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 10646 Jul 10 21:34 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy       4096 Jul  8 15:07 Lesson3/
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul 10 21:15 Lesson4/
arturttl79@artur-pc:~$ ll
total 80
drwxr-x--- 9 arturttl79 arturttl79  4096 Jul 16 21:27 ./
drwxr-xr-x 5 root       root        4096 Jul  8 17:30 ../
-rw------- 1 arturttl79 arturttl79  9051 Jul 16 20:25 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79   220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79  3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79  4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79    20 Jul 16 21:23 .lesshst
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79   807 Jan  6  2022 .profile
-rw-rw-r-- 1 arturttl79 arturttl79    66 Jul 16 21:11 .selected_editor
drwx------ 2 arturttl79 arturttl79  4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79     0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 10646 Jul 10 21:34 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy       4096 Jul  8 15:07 Lesson3/
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul 10 21:15 Lesson4/
arturttl79@artur-pc:~$ ll
total 80
drwxr-x--- 9 arturttl79 arturttl79  4096 Jul 16 21:27 ./
drwxr-xr-x 5 root       root        4096 Jul  8 17:30 ../
-rw------- 1 arturttl79 arturttl79  9051 Jul 16 20:25 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79   220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79  3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79  4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79    20 Jul 16 21:23 .lesshst
drwx------ 3 arturttl79 arturttl79  4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79   807 Jan  6  2022 .profile
-rw-rw-r-- 1 arturttl79 arturttl79    66 Jul 16 21:11 .selected_editor
drwx------ 2 arturttl79 arturttl79  4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79     0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 10646 Jul 10 21:34 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul  3 22:18 Lesson2/
drwxrwxr-x 2 proxy      proxy       4096 Jul  8 15:07 Lesson3/
drwxrwxr-x 3 arturttl79 arturttl79  4096 Jul 10 21:15 Lesson4/
arturttl79@artur-pc:~$ ll
total 84
drwxr-x--- 10 arturttl79 arturttl79  4096 Jul 16 21:33 ./
drwxr-xr-x  5 root       root        4096 Jul  8 17:30 ../
-rw-------  1 arturttl79 arturttl79  9051 Jul 16 20:25 .bash_history
-rw-r--r--  1 arturttl79 arturttl79   220 Jan  6  2022 .bash_logout
-rw-r--r--  1 arturttl79 arturttl79  3771 Jan  6  2022 .bashrc
drwx------  3 arturttl79 arturttl79  4096 Jun 27 20:39 .cache/
drwx------  5 arturttl79 arturttl79  4096 Jul  3 20:50 .config/
-rw-------  1 arturttl79 arturttl79    20 Jul 16 21:23 .lesshst
drwx------  3 arturttl79 arturttl79  4096 Jun 27 20:39 .local/
-rw-r--r--  1 arturttl79 arturttl79   807 Jan  6  2022 .profile
-rw-rw-r--  1 arturttl79 arturttl79    66 Jul 16 21:11 .selected_editor
drwx------  2 arturttl79 arturttl79  4096 Jun 27 20:17 .ssh/
-rw-r--r--  1 arturttl79 arturttl79     0 Jun 27 20:18 .sudo_as_admin_successful
-rw-------  1 arturttl79 arturttl79 10646 Jul 10 21:34 .viminfo
drwxrwxr-x  3 arturttl79 arturttl79  4096 Jul  3 22:18 Lesson2/
drwxrwxr-x  2 proxy      proxy       4096 Jul  8 15:07 Lesson3/
drwxrwxr-x  3 arturttl79 arturttl79  4096 Jul 10 21:15 Lesson4/
-rw-rw-r--  1 arturttl79 arturttl79     0 Jul 16 21:33 test.md
drwxrwxr-x  2 arturttl79 arturttl79  4096 Jul 16 21:33 test_folder/