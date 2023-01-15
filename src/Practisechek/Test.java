package Practisechek;

public class Test {
    public static String printTextPerRole(String[] roles, String[] textLines) {

        int indRole; // индекс для перебора ролей в roles
        int indText; // индекс для перебора реплик в textLines
        StringBuilder result = new StringBuilder(); // сюда будем всё складывать

        for (indRole = 0; indRole < roles.length; indRole++) {      // перебираем массив Roles
            result.append(roles[indRole]).append(":").append("\n"); // и кладем в result каждую роль + двоеточие

            for (indText = 0; indText < textLines.length; indText++ ) { // перебираем массив textLines
                if (textLines[indText].startsWith(roles[indRole] + ":")) {    // и если в начале стоит имя из roles, то
                    result.append(textLines[indText].replace(           // удаляем имя, добавляем текст в result и
                            roles[indRole] + ":","")).append("\n"); // переводим курсор на сл. строку
                }
            }
        }
        System.out.println(result);
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Без реплики",
                "Лука Лукич"

        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"
        };
        printTextPerRole(roles, textLines);


    }
}

