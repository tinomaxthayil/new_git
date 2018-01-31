echo "Enter a file name:"
read f
if [ -f $f ]
then
            echo "File"
elif [ -d $f ]
then
            echo "Directory"
else
            echo "Not"
fi




