package com.yb.shardingjdbctest.conf;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;

import java.util.Collection;

public final class ModuloTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<String> {

    public String doEqualSharding(final Collection<String> tableNames, final ShardingValue<String> shardingValue) {
        for (String each : tableNames) {
            if (each.endsWith(shardingValue.getValue())) {
                return each;
            }
        }
        throw new IllegalArgumentException();
    }

    public Collection<String> doInSharding(final Collection<String> tableNames, final ShardingValue<String> shardingValue) {
        return null;
    }

    public Collection<String> doBetweenSharding(final Collection<String> tableNames, final ShardingValue<String> shardingValue) {
        return null;
    }
}