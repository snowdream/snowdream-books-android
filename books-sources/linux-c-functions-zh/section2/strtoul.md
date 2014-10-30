strtoul（将字符串转换成无符号长整型数）
相关函数
atof，atoi，atol，strtod，strtol
表头文件
#include<stdlib.h>
定义函数
unsigned long int strtoul(const char *nptr,char **endptr,int base);
函数说明
strtoul()会将参数nptr字符串根据参数base来转换成无符号的长整型数。参数base范围从2至36，或0。参数base代表采用的进制方式，如base值为10则采用10进制，若base值为16则采用16进制数等。当base值为0时则是采用10进制做转换，但遇到如'0x'前置字符则会使用16进制做转换。一开始strtoul()会扫描参数nptr字符串，跳过前面的空格字符串，直到遇上数字或正负符号才开始做转换，再遇到非数字或字符串结束时('\0')结束转换，并将结果返回。若参数endptr不为NULL，则会将遇到不合条件而终止的nptr中的字符指针由endptr返回。
返回值
返回转换后的长整型数，否则返回ERANGE并将错误代码存入errno中。
附加说明
ERANGE指定的转换字符串超出合法范围。
范例
参考strtol()