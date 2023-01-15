package Practisechek;

public class Opera {
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "no name"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
        };
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    result.append(i + 1).append(")").append(textLines[i].substring(role.length() + 1)).append("\n");
                }
            }
        /*for (int i = 0; i < roles.length; i++) {
            result.append(roles[i] + ":" + '\n');
            for (int i1 = 0; i1 < textLines.length; i1++) {
                if (textLines[i1].startsWith(roles[i] + ":")) {
                    result.append((i1 + 1) + ")" + textLines[i1].substring(roles[i]));
                    //   result.append((i1 + 1) + ")" + textLines[i1].replaceFirst(roles + ":", "") + '\n');
                }
            }
            result.append('\n');
        */
        }
        return String.valueOf(result);
    }
}
