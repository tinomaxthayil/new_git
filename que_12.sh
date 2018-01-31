echo "Enter number"
read num 
fact=1
while [ $num -gt 0 ] 
do
   fact=$(( $factorial * $num ))
   num=$(( $num - 1 ))
done
echo $fact

