class Solution {
    public int findComplement(int num) {
        
int multiplier = 1;
int newNum = 0;
int power = 0;
while(num > 0) {
multiplier = (num % 2 == 0) ? 1 : 0;
num = num / 2;
newNum += Math.pow(2, power) * multiplier;
power++;
}
return newNum;
}
}
    
