#!/bin/bash
cd books-sources
for file in *
do
  if [ -d $file ]
  then 
    echo build book:  $file
    gitbook build $file --output=../books/$file
    echo 
   elif [ -f $file ]
   then
      echo $file
   fi
done
