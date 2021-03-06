//========================================================================
//Copyright 2007-2009 David Yu dyuproject@gmail.com
//------------------------------------------------------------------------
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at 
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//========================================================================

package io.protostuff.parser;

/**
 * Holds a reference to a {@link Field}.
 * 
 * @author David Yu
 * @created Dec 21, 2009
 */
public class FieldHolder
{

    Field<?> field;

    void setField(Field<?> field)
    {
        this.field = field;
    }

    public Field<?> getField()
    {
        return field;
    }

}
