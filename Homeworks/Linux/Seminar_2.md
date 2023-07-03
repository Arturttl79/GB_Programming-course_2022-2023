arturttl79@artur-pc:~$ mkdir Lesson2
arturttl79@artur-pc:~$ ll
total 56
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 21:57 ./
drwxr-xr-x 3 root       root       4096 Jun 27 20:17 ../
-rw------- 1 arturttl79 arturttl79 1712 Jul  3 21:18 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79  220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79 3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79 4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79   20 Jul  3 21:50 .lesshst
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79  807 Jan  6  2022 .profile
drwx------ 2 arturttl79 arturttl79 4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79    0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 4140 Jul  3 21:56 .viminfo
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 21:57 Lesson2/
-rw-rw-r-- 1 arturttl79 arturttl79    0 Jul  3 21:55 mytextfile.txt
arturttl79@artur-pc:~$ cd Lesson2/
arturttl79@artur-pc:~/Lesson2$ cat > file1
Hi
This is file 1!
arturttl79@artur-pc:~/Lesson2$ cat > file2
Hii again. This is file2
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 21:58 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 21:57 ../
-rw-rw-r-- 1 arturttl79 arturttl79   19 Jul  3 21:58 file1
-rw-rw-r-- 1 arturttl79 arturttl79   25 Jul  3 21:59 file2
arturttl79@artur-pc:~/Lesson2$ cat file1 file2 file3
Hi
This is file 1!
Hii again. This is file2
cat: file3: No such file or directory
arturttl79@artur-pc:~/Lesson2$ cat file1 file2 >> file3
arturttl79@artur-pc:~/Lesson2$ ll
total 20
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:01 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 21:57 ../
-rw-rw-r-- 1 arturttl79 arturttl79   19 Jul  3 21:58 file1
-rw-rw-r-- 1 arturttl79 arturttl79   25 Jul  3 21:59 file2
-rw-rw-r-- 1 arturttl79 arturttl79   44 Jul  3 22:01 file3
arturttl79@artur-pc:~/Lesson2$ vim file3
arturttl79@artur-pc:~/Lesson2$ mv file3 file_final
arturttl79@artur-pc:~/Lesson2$ ll
total 20
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:01 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ../
-rw-rw-r-- 1 arturttl79 arturttl79   19 Jul  3 21:58 file1
-rw-rw-r-- 1 arturttl79 arturttl79   25 Jul  3 21:59 file2
-rw-rw-r-- 1 arturttl79 arturttl79   44 Jul  3 22:01 file_final
arturttl79@artur-pc:~/Lesson2$ mkdir task_2
arturttl79@artur-pc:~/Lesson2$ mv -i file1 file2 file_final ~/Lesson2/task_2
arturttl79@artur-pc:~/Lesson2$ ll
total 12
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:05 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ../
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:05 task_2/
arturttl79@artur-pc:~/Lesson2$ cd task_2
arturttl79@artur-pc:~/Lesson2/task_2$ ll
total 20
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:05 ./
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:05 ../
-rw-rw-r-- 1 arturttl79 arturttl79   19 Jul  3 21:58 file1
-rw-rw-r-- 1 arturttl79 arturttl79   25 Jul  3 21:59 file2
-rw-rw-r-- 1 arturttl79 arturttl79   44 Jul  3 22:01 file_final
arturttl79@artur-pc:~/Lesson2/task_2$ rm file1
arturttl79@artur-pc:~/Lesson2/task_2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:05 ./
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:05 ../
-rw-rw-r-- 1 arturttl79 arturttl79   25 Jul  3 21:59 file2
-rw-rw-r-- 1 arturttl79 arturttl79   44 Jul  3 22:01 file_final
arturttl79@artur-pc:~/Lesson2/task_2$ cd ..
arturttl79@artur-pc:~/Lesson2$ cd ..
arturttl79@artur-pc:~$ ll
total 56
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ./
drwxr-xr-x 3 root       root       4096 Jun 27 20:17 ../
-rw------- 1 arturttl79 arturttl79 1712 Jul  3 21:18 .bash_history
-rw-r--r-- 1 arturttl79 arturttl79  220 Jan  6  2022 .bash_logout
-rw-r--r-- 1 arturttl79 arturttl79 3771 Jan  6  2022 .bashrc
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .cache/
drwx------ 5 arturttl79 arturttl79 4096 Jul  3 20:50 .config/
-rw------- 1 arturttl79 arturttl79   20 Jul  3 21:50 .lesshst
drwx------ 3 arturttl79 arturttl79 4096 Jun 27 20:39 .local/
-rw-r--r-- 1 arturttl79 arturttl79  807 Jan  6  2022 .profile
drwx------ 2 arturttl79 arturttl79 4096 Jun 27 20:17 .ssh/
-rw-r--r-- 1 arturttl79 arturttl79    0 Jun 27 20:18 .sudo_as_admin_successful
-rw------- 1 arturttl79 arturttl79 7247 Jul  3 22:01 .viminfo
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:05 Lesson2/
-rw-rw-r-- 1 arturttl79 arturttl79    0 Jul  3 21:55 mytextfile.txt
arturttl79@artur-pc:~$ cd Lesson2/
arturttl79@artur-pc:~/Lesson2$ ll
total 12
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:05 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ../
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:05 task_2/
arturttl79@artur-pc:~/Lesson2$ rm -rf task_2/
arturttl79@artur-pc:~/Lesson2$ ll
total 8
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:06 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ../
arturttl79@artur-pc:~/Lesson2$ cat > file1
123
456
789
Hello, World!
arturttl79@artur-pc:~/Lesson2$ cp file1 file2
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:07 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:01 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2
arturttl79@artur-pc:~/Lesson2$ vim file2
arturttl79@artur-pc:~/Lesson2$ ln -s file1 file3
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:09 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:07 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3 -> file1
arturttl79@artur-pc:~/Lesson2$ man ln
arturttl79@artur-pc:~/Lesson2$ man ln
arturttl79@artur-pc:~/Lesson2$ ln file1 file4
arturttl79@artur-pc:~/Lesson2$ ll
total 20
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:11 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 2 arturttl79 arturttl79   26 Jul  3 22:07 file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3 -> file1
-rw-rw-r-- 2 arturttl79 arturttl79   26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ ls -li
total 12
1572888 -rw-rw-r-- 2 arturttl79 arturttl79 26 Jul  3 22:07 file1
1572889 -rw-rw-r-- 1 arturttl79 arturttl79 26 Jul  3 22:07 file2
1572890 lrwxrwxrwx 1 arturttl79 arturttl79  5 Jul  3 22:09 file3 -> file1
1572888 -rw-rw-r-- 2 arturttl79 arturttl79 26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ ls -lai
total 20
1572887 drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:11 .
1572866 drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ..
1572888 -rw-rw-r-- 2 arturttl79 arturttl79   26 Jul  3 22:07 file1
1572889 -rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2
1572890 lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3 -> file1
1572888 -rw-rw-r-- 2 arturttl79 arturttl79   26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ rm file1
arturttl79@artur-pc:~/Lesson2$ ls -lia
total 16
1572887 drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:13 .
1572866 drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ..
1572889 -rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2
1572890 lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3 -> file1
1572888 -rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ mv file2 file2_new
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:15 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3 -> file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ mv file3 file3_new
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:15 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3_new -> file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4
arturttl79@artur-pc:~/Lesson2$ mv file4 file4_new
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:16 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3_new -> file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4_new
arturttl79@artur-pc:~/Lesson2$ ln -s file2_new file5_new_ln
arturttl79@artur-pc:~/Lesson2$ ll
total 16
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:17 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3_new -> file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4_new
lrwxrwxrwx 1 arturttl79 arturttl79    9 Jul  3 22:17 file5_new_ln -> file2_new
arturttl79@artur-pc:~/Lesson2$ mkdir folder
arturttl79@artur-pc:~/Lesson2$ ll
total 20
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:17 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3_new -> file1
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4_new
lrwxrwxrwx 1 arturttl79 arturttl79    9 Jul  3 22:17 file5_new_ln -> file2_new
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:17 folder/
arturttl79@artur-pc:~/Lesson2$ cd folder/
arturttl79@artur-pc:~/Lesson2/folder$ cd..
cd..: command not found
arturttl79@artur-pc:~/Lesson2/folder$ cd ..
arturttl79@artur-pc:~/Lesson2$ mv -i file3_new file5_new_ln ~/Lesson2/folder
arturttl79@artur-pc:~/Lesson2$ ll
total 20
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:18 ./
drwxr-x--- 7 arturttl79 arturttl79 4096 Jul  3 22:11 ../
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file2_new
-rw-rw-r-- 1 arturttl79 arturttl79   26 Jul  3 22:07 file4_new
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:18 folder/
arturttl79@artur-pc:~/Lesson2$ cd folder
arturttl79@artur-pc:~/Lesson2/folder$ ll
total 8
drwxrwxr-x 2 arturttl79 arturttl79 4096 Jul  3 22:18 ./
drwxrwxr-x 3 arturttl79 arturttl79 4096 Jul  3 22:18 ../
lrwxrwxrwx 1 arturttl79 arturttl79    5 Jul  3 22:09 file3_new -> file1
lrwxrwxrwx 1 arturttl79 arturttl79    9 Jul  3 22:17 file5_new_ln -> file2_new
arturttl79@artur-pc:~/Lesson2/folder$