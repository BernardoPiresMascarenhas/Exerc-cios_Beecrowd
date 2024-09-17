#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void trocar(char *a, char *b) {
    char temp[100];
    strcpy(temp, a);
    strcpy(a, b);
    strcpy(b, temp);
}

void bubbleSort(char arr[][100], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (strcmp(arr[j], arr[j + 1]) > 0) {
                trocar(arr[j], arr[j + 1]);
            }
        }
    }
}

void removeCharAtStart(char *str) {
    if (str[0] == '+' || str[0] == '-') {
        memmove(str, str + 1, strlen(str)); 
        str[strlen(str)] = '\0';
    }
}

int main() {
    int n;
    scanf("%d", &n);
    getchar(); 

    char nomes[n][100];
    int cont_comportada = 0;
    int cont_notComportada = 0;

    for (int i = 0; i < n; i++) {
        fgets(nomes[i], 100, stdin);
        nomes[i][strcspn(nomes[i], "\n")] = '\0';

        if (nomes[i][0] == '+') {
            cont_comportada++;
        } else if (nomes[i][0] == '-') {
            cont_notComportada++;
        }
    }

    bubbleSort(nomes, n);

    for (int i = 0; i < n; i++) {
        removeCharAtStart(nomes[i]);
        printf("%s\n", nomes[i]);
    }

    printf("Se comportaram: %d | Não se comportaram: %d\n", cont_comportada, cont_notComportada);

    return 0;
}
