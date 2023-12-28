package vn.cmcglobal.coding1;

import java.util.Base64;

/**
 *
 *                                              .:^~~~~^:.
 *                                           ^!?JYYYYYYYYJ?!:
 *                                         ^?YYYJ?7!!!!7?JYYY?^
 *                                        !YJJJ!:        :!JJJY!
 *                                       !YJJ?:            :?JJY!
 *                                      .JYYY^              ^YYYJ.
 *                               ..:::.  :^!?.              .?!^:  .:::..
 *                           :~7?JJJYY7 .7^.                  .^7. 7YYJJJ?7~.
 *                         ^7JYYYJ????7 :YYJ!.              .!JYY: 7????JYYYJ7^
 *                       .7YYYJ7^.      .7YJYJ^            ~JYJY7.      .^7JYYY7.
 *                       7YJY?:           ~JYJY7.        .7YJYJ^           :?YJY7
 *                      ~YJJ?.          :! .7YJYJ^      ^JYJY7. !:          .JJJY^
 *                      !YJY7           :Y?: ~JYJY7.  .7YJYJ~ :?Y:           7YJY!
 *                      ~YJJ?           :JYJ~ :?YJYJ^^JYJY?: ~JYJ:          .?JJY~
 *                      .?YJY7.         .JJJJ.  ~JYJJJJYJ~  .JJJJ.         .7YJY?.
 *                       .7YJYJ!:.      ~JJJJ.   :?YJJY?:   .JJJJ~      .:!JYJY7.
 *                         ^?JYYYJ?777?JYYYY7      !JJ~      7YYYYJ?777?JYYYJ?^
 *                           :!7JJYYYYYJJ?!:        ::        :!?JJYYYYYJJ7!:
 *                              ..:^^^:..                        ..:^^^:..
 *
 *         .:.  .   .   .:.      .:.   .:.   ....  ...    .:.   ...    ..   ..... .  ....  .   .
 *       :7~^~.:J!.~J~ !~^^^   :7^^~:.!~^~7:.?^^7~.?^^7:^!^^~! ~7^^?: .77: .^!7^.~! ~!^^!~ 7?^ 7^
 *       !7    ^?^7^7~:J.  .   !7    ^?   7!.J~!7:.J~~!.7!  .J:~?^7!..?!~?:  ~7  ~7 J^  ^J ?^~!?^
 *        ~~~~::!   ~^ ^~~~^    ~~~~: ^~~~^ .! .!:.!.   .~~~~: ^~ :~.~^..^!  ^~  ^~ :~~~~: !: :7:
 *
 */
public class Main {
    public static void main(String[] args) {
        String language = "java";

        var flag1 = "go-&&-rust-*";
        String strJox = h.strJox(flag1, language);

        y f = new y();

        var flag1Encoded = Base64.getEncoder().encodeToString(strJox.getBytes());
        System.out.println("Flag1 Enc: " + flag1Encoded); // output: wrPCrcOBw6TDssOvwp7Ct8KnwrbDgcOo
        f.setFlag(flag1Encoded);

        var flag2 = "<censored>";
        String strJox = h.strJox(flag2, language);

        var flag2Encoded = Base64.getEncoder().encodeToString(strJox.getBytes());
        System.out.println("Flag2 Enc: " + flag2Encoded); // output: w7nCrsKDwrTCscOvwobCo8KiwqPDgcOo

        var flag = flag1 + flag2;
        System.out.println("Flag is: " + flag);
    }
}