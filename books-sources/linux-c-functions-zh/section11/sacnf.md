sacnf（格式化字符串输入）
<pre>相关函数
fscanf，snprintf
表头文件
#include< stdio.h>
定义函数
int scanf(const char * format,.......);
函数说明
scanf()会将输入的数据根据参数format字符串来转换并格式化数据。Scanf()格式转换的一般形式如下
％[*][size][l][h]type
以中括号括起来的参数为选择性参数，而％与type则是必要的。
* 代表该对应的参数数据忽略不保存。
size 为允许参数输入的数据长度。
l 输入的数据数值以long int 或double型保存。
h 输入的数据数值以short int 型保存。
底下介绍type的几种形式
％d 输入的数据会被转成一有符号的十进制数字（int）。
％i 输入的数据会被转成一有符号的十进制数字，若输入数据以“0x”或“0X”开头代表转换十六进制数字，若以“0”开头则转换八进制数字，其他情况代表十进制。
％0 输入的数据会被转换成一无符号的八进制数字。
％u 输入的数据会被转换成一无符号的正整数。
％x 输入的数据为无符号的十六进制数字，转换后存于unsigned int型变量。
％X 同％x
％f 输入的数据为有符号的浮点型数，转换后存于float型变量。
％e 同％f
％E 同％f
％g 同％f
％s 输入数据为以空格字符为终止的字符串。
％c 输入数据为单一字符。
[] 读取数据但只允许括号内的字符。如[a-z]。
[^] 读取数据但不允许中括号的^符号后的字符出现，如[^0-9].
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
范例
#include < stdio.h>
main()
{
int i;
unsigned int j;
char s[5];
scanf(“%d %x %5[a-z] %*s %f”,&i,&j,s,s);
printf(“%d %d %s\n”,i,j,s);
}
执行
10 0x1b aaaaaaaaaa bbbbbbbbbb
10 27 aaaaa</pre>