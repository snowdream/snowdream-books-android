vprintf（格式化输出数据）
<pre>相关函数
printf，vfprintf，vsprintf
表头文件
#include< stdio.h>
#include< stdarg.h>
定义函数
int vprintf(const char * format,va_list ap);
函数说明
vprintf()作用和printf()相同，参数format格式也相同。va_list为不定个数的参数列，用法及范例请参考附录C。
返回值
成功则返回实际输出的字符数，失败则返回-1，错误原因存于errno中。
范例
#include< stdio.h>
#include< stdarg.h>
int my_printf( const char *format,……)
{
va_list ap;
int retval;
va_start(ap,format);
printf(“my_printf( ):”);
retval = vprintf(format,ap);
va_end(ap);
return retval;
}
main()
{
int i = 150,j = -100;
double k = 3.14159;
my_printf(“%d %f %x\n”,j,k,i);
my_printf(“%2d %*d\n”,i,2,i);
}
执行
my_printf() : -100 3.14159 96
my_printf() : 150 150</pre>