/*
 * Copyright (c) 2017 by Tran Le Duy
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.calc.casio.token.factory;

import com.duy.calc.casio.token.PlaceholderToken;

/**
 * Statically create Placeholders through anonymous classes.
 *
 * @author Alston Lin
 * @version 3.0
 */
public class PlaceholderFactory {

 /*   public static PlaceholderToken makeSuperscriptBlock() {
        return new PlaceholderToken("□", PlaceholderToken.SUPERSCRIPT_BLOCK);
    }
*/
    public static PlaceholderToken makeBaseBlock() {
        return new PlaceholderToken("□", PlaceholderToken.BASE_BLOCK);
    }

/*
    public static PlaceholderToken makeSubscriptBlock() {
        return new PlaceholderToken("□", PlaceholderToken.SUBSCRIPT_BLOCK);
    }
*/

    public static PlaceholderToken makeComma() {
        return new PlaceholderToken(",", PlaceholderToken.COMMA);
    }
}
