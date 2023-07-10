#!/bin/bash

# Создать скрипт ownersort.sh, который в заданной папке копирует файлы в директории, названные по имени владельца каждого файла. Учтите, что файл должен принадлежать соответствующему владельцу.

dir=$1

if [ -d ${dir} ]; then
        count=$(cd ${dir} | find ${dir} -maxdepth 1 -type f | wc -l)
        cd ${dir}
        for (( i=0; i<$count; i++ )); do
                current_file=$(files=(*);echo ${files[${i}]})
                owner_name=$(stat -c"%U" $current_file)
                sudo cp $current_file /home/$owner_name
                echo "Copying of $current_file from $1 directory to /home/$owner_name directory performed successfully!"
        done
else
        echo 'Directory ${dir} not exists!'
fi