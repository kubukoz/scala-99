#!/usr/bin/env bash

readonly PACKAGE="com.kubukoz.scala99"
readonly PACKAGE_PATH=${PACKAGE//.//}

readonly TASK_NUMBER=P$(printf "%02d" $1)

readonly COMPLETION_DATE=$(date)

if [ -n "$1" ]; then
    echo - \
        \[${TASK_NUMBER}\]  \(src/main/scala/${PACKAGE_PATH}/${TASK_NUMBER}.scala\) \
        \([tests]           \(src/test/scala/${PACKAGE_PATH}/${TASK_NUMBER}Tests.scala\)\) \
        completed ${COMPLETION_DATE} >> README.md
else
    printf "\tUsage: ./add-solution.sh 1\n"
fi