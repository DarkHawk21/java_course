#include<stdio.h>
#include <unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <string.h>
#define Size 80

int main(void){
	int fd[2], fd2[2], nbytes;
	pid_t childpid;
	char string[]="Hola hijo!\n";
	char stringdos[]="Hola papá!\n";
	char readbuffer[80];
	
	pipe(fd);
	pipe(fd2);

	if((childpid =fork())==-1){
	perror("fork");
	exit(1);
	}
	
	if(childpid==0){
	close( fd[1] ); 
    	close( fd2[0] );

	while( (nbytes=read( fd[0], readbuffer, Size) ) > 0)
     	 write( 1, readbuffer, nbytes);
	printf("cadena recibida: %s", readbuffer);
    	close( fd[0] );
    
    	write( fd2[1], stringdos, strlen(stringdos) );
   	close( fd2[1] );
	
	}

	else{
	close( fd[0] ); 
    	close( fd2[1] );
	
	 write( fd[1], string, strlen( string ) );
    	close( fd[1]);


	while( (nbytes=read( fd2[0], readbuffer, Size )) > 0)
         write( 1, readbuffer, nbytes );
	printf("cadena recibida: %s", readbuffer);
    	close( fd2[0]);
  }
  return (0);
}
