class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<String>();

        int i=0;

        while(i<words.length){
            int wordlength =0;
            ArrayList<String> arrlist = new ArrayList<>();
           while(i<words.length && wordlength+words[i].length()+arrlist.size() <= maxWidth){
            wordlength += words[i].length();
            arrlist.add(words[i]);
            i++;
           }

            int gap = arrlist.size() -1;
            StringBuilder sb = new StringBuilder();

            if(i==words.length || gap==0){
                for(int k=0;k<arrlist.size();k++){
                    sb.append(arrlist.get(k));

                    if(k!=arrlist.size()-1){
                        sb.append(" ");
                    }
                }

                while(sb.length()<maxWidth){
                    sb.append(" ");
                }
            }else {
                int totalSpace = maxWidth - wordlength;
                int baseSpace = totalSpace / gap;
                int extraSpace = totalSpace % gap;

                for(int k=0;k<arrlist.size();k++){
                
                if(k!= arrlist.size() - 1){
                    sb.append(arrlist.get(k)).append(" ".repeat(baseSpace));
                    if(extraSpace>0){
                        sb.append(" ");
                        extraSpace--;
                    }
                }else {
                        sb.append(arrlist.get(k));
                    }
            }
            }

           

            result.add(sb.toString());

        }

        return result;
    }
}