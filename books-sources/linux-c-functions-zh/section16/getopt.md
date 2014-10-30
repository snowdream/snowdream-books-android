getopt（分析命令行参数）
<pre>相关函数

表头文件
#include< unistd.h>
定义函数
int getopt(int argc,char * const argv[ ],const char * optstring);
函数说明
getopt()用来分析命令行参数。参数argc和argv是由main()传递的参数个数和内容。参数optstring 则代表欲处理的选项字符串。此函数会返回在argv 中下一个的选项字母，此字母会对应参数optstring 中的字母。如果选项字符串里的字母后接着冒号“:”，则表示还有相关的参数，全域变量optarg 即会指向此额外参数。如果getopt()找不到符合的参数则会印出错信息，并将全域变量optopt设为“?”字符，如果不希望getopt()印出错信息，则只要将全域变量opterr设为0即可。
返回值
如果找到符合的参数则返回此参数字母，如果参数不包含在参数optstring 的选项字母则返回“?”字符，分析结束则返回-1。
范例
#include< stdio.h>
#include< unistd.h>
int main(int argc,char **argv)
{
int ch;
opterr = 0;
while((ch = getopt(argc,argv,”a:bcde”))!= -1)
switch(ch)
{
case ‘a’:
printf(“option a:’%s’\n”,optarg);
break;
case ‘b’:
printf(“option b :b\n”);
break;
default:
printf(“other option :%c\n”,ch);
}
printf(“optopt +%c\n”,optopt);
}
执行
$./getopt –b
option b:b
$./getopt –c
other option:c
$./getopt –a
other option :?
$./getopt –a12345
option a:’12345’
　
</pre>