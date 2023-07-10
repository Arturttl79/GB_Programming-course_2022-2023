#!/bin/bash

# Написать скрипт очистки директорий. На вход принимает путь к директории. 
# Если директория существует, то удаляет в ней все файлы с расширениями .bak, .tmp, .backup. Если директории нет, то выводит ошибку.

dir=$1

if [ -d ${dir} ]; then
        cd ${dir}; rm -r *.bak *.tmp *.backup; echo "Removal of .bak, .tmp, .backup files in ${dir} is done!"
else
        echo "${dir} directory not exists!"
fi