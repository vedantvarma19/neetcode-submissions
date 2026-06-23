class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>set = new HashSet<>(); 

        for(String email : emails){ 
            String[] part = email.split("@");
            String local = part[0];
            String domain = part[1]; 

            int positiveIndex = local.indexOf('+');
            if( positiveIndex != -1){ 
                local = local.substring(0,positiveIndex);
            }
            local= local.replace(".","");
            set.add(local + "@" + domain); 
        }
        return set.size();        
    }
}