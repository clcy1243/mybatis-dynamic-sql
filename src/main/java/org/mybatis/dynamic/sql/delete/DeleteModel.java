/**
 *    Copyright 2016-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.dynamic.sql.delete;

import java.util.Optional;

import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.where.WhereModel;

public class DeleteModel {
    private SqlTable table;
    private WhereModel whereModel;
    
    private DeleteModel() {
        super();
    }
    
    public SqlTable table() {
        return table;
    }
    
    public Optional<WhereModel> whereModel() {
        return Optional.ofNullable(whereModel);
    }
    
    public static DeleteModel of(SqlTable table) {
        return of(table, null);
    }

    public static DeleteModel of(SqlTable table, WhereModel whereModel) {
        DeleteModel deleteModel = new DeleteModel();
        deleteModel.table = table;
        deleteModel.whereModel = whereModel;
        return deleteModel;
    }
}
