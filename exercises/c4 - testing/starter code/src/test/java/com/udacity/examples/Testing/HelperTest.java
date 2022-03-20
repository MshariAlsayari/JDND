package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HelperTest {



    @Test
    public void get_count_test(){
        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("M");
        list.add("");
        list.add("M");
        long count = Helper.getCount(list);
        Assert.assertEquals(1, count);
    }

    @Test
    public void get_merged_List_test(){
        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("M");
        list.add("");
        list.add("M");
        String mergedList = Helper.getMergedList(list);
        Assert.assertEquals("M, M, M", mergedList);
    }

    @Test
    public void get_filtered_list_test(){
        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("M");
        list.add("");
        list.add("M");
        List<String> filteredList = Helper.getFilteredList(list);
        String[] expectedList = {"M","M","M",};
        Assert.assertArrayEquals(expectedList, filteredList.toArray());
    }

	
}
